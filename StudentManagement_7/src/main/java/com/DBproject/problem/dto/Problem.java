package com.DBproject.problem.dto;

public class Problem {
	
	private int Book_code;
	private String Bname;
	private int Problem_code;
	private int Pchap;
	private int Pnumber;
	private String type;
	
	public int getBook_code() {
		return Book_code;
	}
	public void setBook_code(int book_code) {
		Book_code = book_code;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getProblem_code() {
		return Problem_code;
	}
	public void setProblem_code(int problem_code) {
		Problem_code = problem_code;
	}
	public int getPchap() {
		return Pchap;
	}
	public void setPchap(int pchap) {
		Pchap = pchap;
	}
	public int getPnumber() {
		return Pnumber;
	}
	public void setPnumber(int pnumber) {
		Pnumber = pnumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
