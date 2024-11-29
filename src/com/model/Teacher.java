package com.model;

public class Teacher {
	private String tid;
	private String password;
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", password=" + password + "]";
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
