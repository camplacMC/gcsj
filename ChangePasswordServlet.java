package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.dao.StudentDao;
import com.model.Student;
import com.model.User;
import com.service.LoginService;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangePasswordServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		LoginDao ld=new LoginDao();
		String status = "2";
		String username =request.getParameter("username");
		System.out.println(username);
		
		String oldpassword = request.getParameter("oldPassword");
		String newpassword = request.getParameter("newPassword");
		if(oldpassword.equals(newpassword)){
			request.setAttribute("msg", "密码一致,请重新输入");
			request.getRequestDispatcher("/cpw.jsp").forward(request, response);
		}else{
			LoginService ls = new LoginService();
			ld.ChangePassword(username,newpassword);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
