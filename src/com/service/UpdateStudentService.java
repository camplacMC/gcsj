package com.service;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.dao.StudentDao;
import com.model.Student;
import com.util.JDBCUtils2;

public class UpdateStudentService {
	static StudentDao sd = new StudentDao();
	public static void Update(Student student){
		sd.Update(student);
	}
		


}
