package com.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.dao.LoginDao;
import com.model.Student;
import com.model.User;
import com.util.JDBCUtils2;

public class LoginService {
	
	LoginDao ld = new LoginDao();
	
	public User login(String sid,String password){
		return ld.login(sid, password);
	}
	
	public User loginByUsername(String username){
		return ld.loginByUsername(username);
	}
	public User loginBySid(String sid){
		return ld.loginBySid(sid);
	}
	
}
