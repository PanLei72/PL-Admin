'use strict';

app
.run(
    function ($rootScope,   $state,   $stateParams,$localStorage,$http) {
          $http.defaults.headers.common['Authorization'] = 'Basic ' + $localStorage.auth;
          $rootScope.$state = $state;
          $rootScope.$stateParams = $stateParams;
          
          $rootScope.$on('$stateChangeSuccess', function(event, to, toParams, from, fromParams) {
              $rootScope.previousState = from;
              $rootScope.previousStateParams = fromParams;
            });
      }
  )
.config(
      function ($stateProvider,   $urlRouterProvider) {
    	  $urlRouterProvider
          .otherwise('/auth/loading');
      $stateProvider
          .state('auth',{
              abstract: true,
              url:'/auth',
              template: '<div ui-view class="fade-in"></div>',
              resolve: {
                  deps: ['$ocLazyLoad',
                    function( $ocLazyLoad ){
                      return $ocLazyLoad.load('admin/auth/ctrl.js');
                  }]
              }
          })
          .state('auth.loading',{
              url:'/loading',
              templateUrl:'admin/auth/loading.html',
          })
          .state('auth.login',{
              url:'/login',
              templateUrl:'admin/auth/login.html',
          })
          .state('app', {
              abstract: true,
              url: '/app',
              templateUrl: 'admin/app.html',
          })
          .state('app.dashboard', {
              url: '/dashboard',
              templateUrl: 'admin/app_dashboard.html',
          })

          //system
          .state('app.system', {
              abstract: true,
              url: '/system',
              template: '<div ui-view class="fade-in"></div>',
              resolve: {
                  deps: ['$ocLazyLoad',
                    function( $ocLazyLoad ){
                      return $ocLazyLoad.load('admin/system/ctrl.js');
                  }]
              }
          })
          .state('app.system.list', {
              url: '/list?page&search',
              templateUrl: 'admin/system/list.html',
          })
          .state('app.system.detail', {
              url: '/detail/{id}',
              templateUrl: 'admin/system/detail.html',
          })
          .state('app.system.create', {
              url: '/create',
              templateUrl: 'admin/system/detail.html',
          })


      }
  );