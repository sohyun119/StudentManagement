package com.DBproject.user.model;

import java.util.Date;

public class Student {

	private int Student_code;
	private String loginId;
	private String password;
	private String Sname;
	private String SphoneNumber;
	private Date createdAt;
	private Date updateAt;
	
	
	public int getStudent_code() {
		return Student_code;
	}
	public void setStudent_code(int student_code) {
		Student_code = student_code;
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
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSphoneNumber() {
		return SphoneNumber;
	}
	public void setSphoneNumber(String sphoneNumber) {
		SphoneNumber = sphoneNumber;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	
	
	
	
}
