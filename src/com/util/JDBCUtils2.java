package com.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils2 {
	public static String drivername;
	public static String url;
	public static String username;
	public static String password;
	
	//创建一个连接池对象
	public static BasicDataSource dataSource=new BasicDataSource();
	static{
		try {
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/student");
			dataSource.setUsername("root");
			dataSource.setPassword("599030621");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//返回连接池对象
	public static DataSource getDataSource() {
		// TODO Auto-generated method stub
		return dataSource;
	}

	
	
}