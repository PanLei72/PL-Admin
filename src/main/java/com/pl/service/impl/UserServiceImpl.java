package com.pl.service.impl;


import com.pl.service.ifc.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by alvin on 15/9/7.
 */
//@Service("UserService") ע�����ڱ�ʾ����Ϊҵ������,��ʹ��ʱ�ᱻע�������Զ���
    //spring����ע��,�������Ǵ���ʵ��
@Service("UserService")
public class UserServiceImpl implements UserService {
    //�Զ�ע��iuserdao ���ڷ������ݿ�
    @Autowired
//    IUserDao Mapper;

    //��¼������ʵ��,��jspҳ���ȡusername��password
    public boolean login(String username, String password) {
//        System.out.println("������˺�:" + username + "���������:" + password);
        //�������˺Ž��в�ѯ,ȡ�����ݿ��б������Ϣ
//        User user = Mapper.selectByName(username);
//        if (user != null) {
//            System.out.println("��ѯ�������˺�:" + user.getUsername() + "����:" + user.getPassword());
//            System.out.println("---------");
//            if (user.getUsername().equals(username) && user.getPassword().equals(password))
//                return true;

//        }
        return false;

    }
}