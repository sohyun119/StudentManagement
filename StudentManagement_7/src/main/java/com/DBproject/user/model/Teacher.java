package com.DBproject.user.model;

import java.util.Date;

public class Teacher {
	
	private int Teacher_code;
	private String loginId;
	private String password;
	private String Tname;
	private String TphoneNumber;
	private String subject;
	private Date createdAt;
	private Date updatedAt;
	
	
	public int getTeacher_code() {
		return Teacher_code;
	}
	public void setTeacher_code(int teacher_code) {
		Teacher_code = teacher_code;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getTphoneNumber() {
		return TphoneNumber;
	}
	public void setTphoneNumber(String tphoneNumber) {
		TphoneNumber = tphoneNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	

}
