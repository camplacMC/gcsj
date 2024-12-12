package com.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.model.Student;
import com.util.JDBCUtils2;

public class searchService {
	public static List<Student> regist(String sid){
		QueryRunner qr = new QueryRunner(JDBCUtils2.getDataSource());
		String sql ="select * from student_info where sname=?";
		Object [] params = {sid};
		try {
			return (List<Student>) qr.query(sql, new BeanListHandler<Student>(Student.class), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
