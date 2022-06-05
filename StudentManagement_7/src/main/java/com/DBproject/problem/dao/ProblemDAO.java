package com.DBproject.problem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.DBproject.problem.dto.Problem;
import com.DBproject.problem.dto.WrongAnswerAll;
import com.DBproject.problem.dto.WrongAnswerDetails;

@Repository
public interface ProblemDAO {
	
	public List<WrongAnswerAll> selectProblem_analysis(
			@Param("Student_code") int Student_code
			, @Param("subject") String subject);
	
	public List<WrongAnswerDetails> selectProblem_Details(
			@Param("Student_code") int Student_code
			, @Param("subject") String subject
			, @Param("type") String type
			);
	
			
	public Problem selectProblem(
			@Param("subject")String subject, 
			@Param("Bname") String Bname, 
			@Param("Pchap") int Pchap, 
			@Param("Pnumber") int Pnumber);
		
	public int insertWrongAnswer(
			@Param("Problem_code") int Problem_code,
			@Param("Student_code") int Student_code,
			@Param("YorNorX") String YorNorX,
			@Param("subject") String subject,
			@Param("type") String type
			);
			

}
