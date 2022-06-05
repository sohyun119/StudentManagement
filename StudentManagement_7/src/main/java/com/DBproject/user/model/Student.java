package com.DBproject.user.model;


public class Student {

	private int Student_code;
	private String loginId;
	private String password;
	private String Sname;
	private String SphoneNumber;
	private String Saddress;
	
	public String getSaddress() {
		return Saddress;
	}
	public void setSaddress(String saddress) {
		Saddress = saddress;
	}
	
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
	
	
	
	
	
	
}
