package com.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.util.JDBCUtils2;
import com.model.Teacher;

public class LoginService {
	//µÇÂ¼·½·¨
	public Teacher login(String tid,String password) throws SQLException{
		QueryRunner qr = new QueryRunner(JDBCUtils2.getDataSource());
		String sql = "select * from teacher_login where tid=? and password=?";
		return qr.query(sql,new BeanHandler<Teacher>(Teacher.class),tid,password);
	}
}
