package com.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dao.LoginDao;
import com.util.JDBCUtils2;

public class RegistService {
	static LoginDao ld = new LoginDao();
	
	public static void regist(String username,String password,String status,String sid){
		ld.regist(username,password,status,sid);
	}
}
