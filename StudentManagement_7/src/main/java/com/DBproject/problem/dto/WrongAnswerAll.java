package com.DBproject.problem.dto;

import java.util.List;

public class WrongAnswerAll {
	
	private String type;
	private int count;
	private List<WrongAnswerDetails> wrongAnswerDetailList;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<WrongAnswerDetails> getWrongAnswerDetailList() {
		return wrongAnswerDetailList;
	}
	public void setWrongAnswerDetailList(List<WrongAnswerDetails> wrongAnswerDetailList) {
		this.wrongAnswerDetailList = wrongAnswerDetailList;
	}
	
	

}
