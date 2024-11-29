package com.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.util.JDBCUtils2;

public class RegistService {
	public static void regist(String tid,String password){
		QueryRunner qr = new QueryRunner(JDBCUtils2.getDataSource());
		String sql ="insert into teacher_login (tid, password) VALUES (?, ?)";
		Object [] params = {tid,password};
		   try {
			qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        System.out.println("×¢²á³É¹¦£ºÕË»§ " + tid + "£¬ÃÜÂë " + password);
	    }
	}
