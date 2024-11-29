package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.model.Student;
import com.util.JDBCUtils2;

public class StudentDao {
	static QueryRunner qr = new QueryRunner(JDBCUtils2.getDataSource());
	public List<Student> findAll(){
		String sql = "select * from student_info";
		
		List<Student> student;
		try {
			student = qr.query(sql, new BeanListHandler<Student>(Student.class));
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void Insert(Student student){
		String sql = "insert into student_info(snum,sid,sname,phone,address,department,major) values(null,?,?,?,?,?,?)";
		Object [] params = {student.getSid(),student.getSname(),student.getPhone(),student.getAddress(),student.getDepartment(),student.getMajor()};
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Delete(String sid){
		String sql = "delete from student_info where sid=?";
		Object[] params = {sid};
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Student findByPid(String snum) {
		String sql="select * from student_info where snum=?";
		try {
			Student student = qr.query(sql, new BeanHandler<Student>(Student.class),snum);
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void Update(Student student){
		String sql = "update student_info set sid=?,sname=?,phone=?,address=?,department=?,major=? where snum=?";
		Object[] params = {student.getSid(),student.getSname(),student.getPhone(),student.getAddress(),student.getDepartment(),student.getMajor(),student.getSnum()};
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
