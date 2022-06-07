package com.DBproject.problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DBproject.problem.bo.ProblemBO;
import com.DBproject.problem.dto.WrongAnswerAll;

@Controller
@RequestMapping("/problem_view")
public class ProblemController {
	
	@Autowired
	private ProblemBO problemBO;
	
	@GetMapping("/analysis")
	public String problem_analysis(HttpServletRequest request, Model model){
		
		HttpSession session = request.getSession();
		int Student_code = (Integer) session.getAttribute("Student_code");
		
		
		List<WrongAnswerAll> MathWrongAnswerAllList = problemBO.problem_analysis(Student_code, "수학");
		model.addAttribute("MathWrongAnswerAllList", MathWrongAnswerAllList);
		
		List<WrongAnswerAll> LanguageWrongAnswerAllList = problemBO.problem_analysis(Student_code, "국어");
		model.addAttribute("LanguageWrongAnswerAllList", LanguageWrongAnswerAllList);
		
		List<WrongAnswerAll> EnglishWrongAnswerAllList = problemBO.problem_analysis(Student_code, "영어");
		model.addAttribute("EnglishWrongAnswerAllList", EnglishWrongAnswerAllList);
		
		List<WrongAnswerAll> ScienceWrongAnswerAllList = problemBO.problem_analysis(Student_code, "과학");
		model.addAttribute("ScienceWrongAnswerAllList", ScienceWrongAnswerAllList);
		
		
		return "problem/analysisView";
	}
	
	
}
