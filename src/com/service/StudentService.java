package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

public class StudentService {
	StudentDao sd = new StudentDao();
	
	public List<Student> findAll(){
		return sd.findAll();
	}
	
	public void Delete(String sid){
		sd.Delete(sid);
	}
	
	public Student findByPid(String snum) {
		return sd.findByPid(snum);
	}
}
