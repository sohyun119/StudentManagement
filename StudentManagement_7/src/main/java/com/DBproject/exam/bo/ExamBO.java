package com.DBproject.exam.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DBproject.exam.dao.ExamDAO;
import com.DBproject.exam.dto.Score;

@Service
public class ExamBO {
	
	@Autowired
	private ExamDAO examDAO;
	
	public List<Score> selectScoreList(int Student_code){
		return examDAO.selectScoreList(Student_code);
	}
	
	
	

}
