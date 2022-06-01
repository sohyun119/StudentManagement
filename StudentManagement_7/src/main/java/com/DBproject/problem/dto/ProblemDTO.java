package com.DBproject.problem.dto;

public class ProblemDTO {
	
	private int Book_Code;
	private String Bname;
	private int Problem_Code;
	private int Pchap;
	private int Pnumber;
	private String Type;
	
	
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getBook_Code() {
		return Book_Code;
	}
	public void setBook_Code(int book_Code) {
		Book_Code = book_Code;
	}
	public int getProblem_Code() {
		return Problem_Code;
	}
	public void setProblem_Cide(int problem_Code) {
		Problem_Code = problem_Code;
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
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	
	
	

}
