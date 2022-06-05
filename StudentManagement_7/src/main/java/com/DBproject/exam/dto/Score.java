package com.DBproject.exam.dto;

public class Score {
	
	private String Exam_Type;
	private int Student_code;
	private String subject;
	private double Score;
	
	public String getExam_Type() {
		return Exam_Type;
	}
	public void setExam_Type(String exam_Type) {
		Exam_Type = exam_Type;
	}
	public int getStudent_code() {
		return Student_code;
	}
	public void setStudent_code(int student_code) {
		Student_code = student_code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getScore() {
		return Score;
	}
	public void setScore(double score) {
		Score = score;
	}
	
	
	

}
