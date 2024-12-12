package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao;
import com.model.Student;
import com.model.User;
import com.service.StudentService;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class SearchProductServlet
 */
@WebServlet("/SearchStudentServlet")
public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		
		LoginDao ld = new LoginDao();
		String username = request.getParameter("username");
		User user = ld.findByUsername(username);
		String tid = user.getTid();
		
		String word = request.getParameter("word");
		
		StudentService ss = new StudentService();
		List<Student> students = ss.findByKey(word,tid);
		
		JSONArray fromObject = JSONArray.fromObject(students);
		response.getWriter().write(fromObject.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
