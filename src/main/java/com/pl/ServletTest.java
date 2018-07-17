package com.pl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet(description = "Servlet Test", urlPatterns = { "/ServletTest" })
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String message;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletTest() {
		super();
		message = "Hello World , Nect To Meet You: " + System.currentTimeMillis();
		System.out.println("servlet≥ı ºªØ°≠°≠");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.write("<h1>" + message + "</h1>");
		destroy();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("servletœ˙ªŸ£°");
		super.destroy();
	}

}
