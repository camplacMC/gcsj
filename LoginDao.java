package com.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.model.Student;
import com.model.User;
import com.util.JDBCUtils2;

public class LoginDao {
	static QueryRunner qr = new QueryRunner(JDBCUtils2.getDataSource());
	
	public User login(String username,String password){
		String sql = "select * from login where username=? and password=?";
		try {
			return qr.query(sql,new BeanHandler<User>(User.class),username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public User loginByUsername(String username){
		String sql = "select * from login where username=?";
		try {
			return qr.query(sql,new BeanHandler<User>(User.class),username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public User findByUsername(String username){
		String sql = "select * from login where username=?";
		try {
			return qr.query(sql,new BeanHandler<User>(User.class),username);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void regist(String username,String password,String status,String sid){
		String sql ="insert into login (tid,sid,username, password,status) VALUES (null,?, ?,?,?)";
		Object [] params = {sid,username,password,status};
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ChangePassword(String username,String newpassword){
		String sql = "update login set password=? where username=?";
		Object[] params ={newpassword,username};
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
