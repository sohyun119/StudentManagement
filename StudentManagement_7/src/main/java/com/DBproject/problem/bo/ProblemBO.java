package com.DBproject.problem.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DBproject.problem.dao.ProblemDAO;
import com.DBproject.problem.dto.Problem;
import com.DBproject.problem.dto.WrongAnswerAll;
import com.DBproject.problem.dto.WrongAnswerDetails;

@Service
public class ProblemBO {
	
	@Autowired
	private ProblemDAO problemDAO;
	
	public List<WrongAnswerAll> problem_analysis(int studetn_code, String subject){
		
		List<WrongAnswerAll> wrongAnswerAllList = problemDAO.selectProblem_analysis(studetn_code, subject);
		
		
		for(WrongAnswerAll wrongAnswerAll : wrongAnswerAllList) {
			
			List<WrongAnswerDetails> wrongAnswerDetailList  = problemDAO.selectProblem_Details(studetn_code, subject, wrongAnswerAll.getType());
			
			wrongAnswerAll.setWrongAnswerDetailList(wrongAnswerDetailList);
		}
		
		return wrongAnswerAllList;
	}

	public int addWrongAnswer(int Student_code, String subject, String Bname, int Pchap, int Pnumber, String YorNorX) {
		
		Problem problem = problemDAO.selectProblem(subject, Bname, Pchap, Pnumber);
		
		int count = problemDAO.insertWrongAnswer(problem.getProblem_code(), Student_code, YorNorX, subject, problem.getType());
		
		return count;
	}

	
	
	

}
