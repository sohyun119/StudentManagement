package com.DBproject.exam;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DBproject.exam.bo.ExamBO;
import com.DBproject.exam.dto.Score;

@RestController
public class ExamRestController {
	
	@Autowired
	private ExamBO examBO;
	
	@GetMapping("/score")
	public ResponseEntity< List<Score> > examList(HttpServletRequest request){
		
		HttpSession session = request.getSession();
		
		int Student_code = (Integer) session.getAttribute("Student_code");
		
		List<Score> scoreList = examBO.selectScoreList(Student_code);
		
		return new ResponseEntity<List<Score>>(scoreList, HttpStatus.OK);
		
	}
	

}
