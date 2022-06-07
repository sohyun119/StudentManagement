package com.DBproject.exam;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.DBproject.exam.bo.ExamBO;
import com.DBproject.exam.dto.Score;

@Controller
public class ExamController {
	
	@Autowired
	private ExamBO examBO;
	
	@GetMapping("/score")
	public String examList(HttpServletRequest request, Model model){
		
		HttpSession session = request.getSession();
		
		int Student_code = (Integer) session.getAttribute("Student_code");
		
		List<Score> scoreList = examBO.selectScoreList(Student_code);
		model.addAttribute("scoreList", scoreList);
		
		return "exam/examView";
		
	}

}
