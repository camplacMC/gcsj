package com.model;

public class User {
	private String tid;
	private String sid;
	private String username;
	private String password;
	private String status;
	public String getUsername() {
		return username;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [tid=" + tid + ", sid=" + sid + ", username=" + username + ", password=" + password + ", status="
				+ status + "]";
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
