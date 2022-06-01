package com.DBproject.problem.dto;

public class BookDTO {
	
	private int Book_Code;
	private String Bname;
	private String subject;
	private int Year_For;
	private String Book_Company;
	
	public int getBook_Code() {
		return Book_Code;
	}
	public void setBook_Code(int book_Code) {
		Book_Code = book_Code;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getYear_For() {
		return Year_For;
	}
	public void setYear_For(int year_For) {
		Year_For = year_For;
	}
	public String getBook_Company() {
		return Book_Company;
	}
	public void setBook_Company(String book_Company) {
		Book_Company = book_Company;
	}
	
	
	

}
