package com.DBproject.problem.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DBproject.problem.dao.ProblemDAO;
import com.DBproject.problem.dto.ProblemAnalysisDTO;
import com.DBproject.problem.dto.ProblemDTO;

@Service
public class ProblemBO {
	
	@Autowired
	private ProblemDAO problemDAO;
	
//	public List<ProblemAnalysisDTO> select_problem_analysis (String subject){
//		
//		List<ProblemAnalysisDTO> problemAnalysisList = new ArrayList<>();
//		problemAnalysisList	= problemDAO.select_problem_analysis(subject);
//		
//		for(ProblemAnalysisDTO problem : problemAnalysisList) {
//			List<ProblemDTO> problemDetailList = new ArrayList<>();
//			
//			problemDetail =	problemDAO.select_problem_detail(problem.getProblem_code());
//			problem.setProblemDTOList(problemDetail);
//		}
//		
//	}
	
//	public List<ProblemAnalysisDTO> select_problem_analysis (String subject){
//		
//	}
	
	

}
