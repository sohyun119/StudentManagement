package com.DBproject.problem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DBproject.problem.bo.ProblemBO;
import com.DBproject.problem.dto.WrongAnswerAll;

@RestController
@RequestMapping("/problem")
public class ProblemRestController {
	
	
	@Autowired
	private ProblemBO problemBO;
	
	@GetMapping("/analysis")
	public ResponseEntity< Map<String, List<WrongAnswerAll>>> problem_analysis(HttpServletRequest request){
		
		HttpSession session = request.getSession();
//		int Student_code = (Integer) session.getAttribute("Student_code");
		int Student_code = 1;
		
		Map<String, List<WrongAnswerAll>> map = new HashMap<>();
		
		List<WrongAnswerAll> MathWrongAnswerAllList = problemBO.problem_analysis(Student_code, "수학");
		map.put("math", MathWrongAnswerAllList);
		
		List<WrongAnswerAll> LanguageWrongAnswerAllList = problemBO.problem_analysis(Student_code, "국어");
		map.put("language", LanguageWrongAnswerAllList);
		
		List<WrongAnswerAll> EnglishWrongAnswerAllList = problemBO.problem_analysis(Student_code, "영어");
		map.put("english", EnglishWrongAnswerAllList);
		
		List<WrongAnswerAll> ScienceWrongAnswerAllList = problemBO.problem_analysis(Student_code, "과학");
		map.put("science", ScienceWrongAnswerAllList);
		
		
		return new ResponseEntity<Map<String, List<WrongAnswerAll>>>(map, HttpStatus.OK);
		
	}
	
	@GetMapping("/AddWrongAnswer")
	public Map<String, String> addWrongAnswer(
			@RequestParam("subject") String subject, 
			@RequestParam("Bname") String Bname, 
			@RequestParam("Pchap") int Pchap, 
			@RequestParam("Pnumber") int Pnumber,
		@RequestParam("YorNorX") String YorNorX, 
		HttpServletRequest request
			){
		
		HttpSession session = request.getSession();
		int Student_code = (Integer) session.getAttribute("Student_code");
		
		int count = problemBO.addWrongAnswer(Student_code, subject, Bname, Pchap, Pnumber, YorNorX);
		
		Map<String, String> map = new HashMap<>();
		if(count == 1) {
			map.put("result", "success");
		}
		else {
			map.put("result", "fail");
		}
		
		return map;
	}

	

}
