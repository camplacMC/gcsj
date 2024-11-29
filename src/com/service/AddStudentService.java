package com.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.util.JDBCUtils2;
import com.model.Student;

public class AddStudentService {
	public static void regist(String sid,String sname,String phone,String address,String department,String major) throws SQLException{
		QueryRunner qr = new QueryRunner(JDBCUtils2.getDataSource());
		String sql ="insert into student_info (sid, sname, phone, address, department, major) VALUES (?, ?, ?, ?, ?, ?)";
		   qr.update(sql, sid, sname, phone, address, department, major);
	        System.out.println("注册成功：学号 " + sid + "，姓名 " + sname);
	    }
	}
