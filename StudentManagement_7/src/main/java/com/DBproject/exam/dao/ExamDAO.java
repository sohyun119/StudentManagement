package com.DBproject.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.DBproject.exam.dto.Score;

@Repository
public interface ExamDAO {
	
	
	public List<Score> selectScoreList(@Param("Student_code") int Student_code);

	

}
