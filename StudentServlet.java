package com.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.model.Student;
import com.model.User;
import com.service.LoginService;
import com.service.StudentService;
import com.vo.PageBean;
import com.vo.PageQuery;


/**
 * Servlet implementation class Product
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		
		StudentService ss=new StudentService();
		LoginService ls = new LoginService();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		User user = ls.loginByUsername(username);
		String tid = user.getTid();
		PageQuery pageQuery=new PageQuery();
		try {
			BeanUtils.populate(pageQuery, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PageBean pageBean = ss.findAll(pageQuery,tid);
		request.setAttribute("pageBean", pageBean);
		
		request.setAttribute("sname", pageQuery.getSname());
		//查找全部商品
		List<Student> findAll = ss.findAllByTid(tid);
		request.setAttribute("findAll", findAll);
		
		// 转发到页面
		request.getRequestDispatcher("/admin/student/list.jsp?tid="+tid).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
