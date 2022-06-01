package com.DBproject.problem.dto;

import java.util.List;

public class ProblemAnalysisDTO {
	
	
	private int Problem_code;
	private int count;
	private String type;
	private List<ProblemDTO> problemDTOList;
	
	
	public int getProblem_code() {
		return Problem_code;
	}
	public void setProblem_code(int problem_code) {
		Problem_code = problem_code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<ProblemDTO> getProblemDTOList() {
		return problemDTOList;
	}
	public void setProblemDTOList(List<ProblemDTO> problemDTOList) {
		this.problemDTOList = problemDTOList;
	}
	
	

}
