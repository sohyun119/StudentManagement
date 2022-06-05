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
		int Student_code = (Integer) session.getAttribute("Student_code");
		
		Map<String, List<WrongAnswerAll>> map = new HashMap<>();
		
		List<WrongAnswerAll> MathWrongAnswerAllList = problemBO.problem_analysis(Student_code, "수학");
		map.put("수학", MathWrongAnswerAllList);
		
		List<WrongAnswerAll> LanguageWrongAnswerAllList = problemBO.problem_analysis(Student_code, "국어");
		map.put("국어", LanguageWrongAnswerAllList);
		
		List<WrongAnswerAll> EnglishWrongAnswerAllList = problemBO.problem_analysis(Student_code, "영어");
		map.put("영어", EnglishWrongAnswerAllList);
		
		List<WrongAnswerAll> ScienceWrongAnswerAllList = problemBO.problem_analysis(Student_code, "과학");
		map.put("과학", ScienceWrongAnswerAllList);
		
		
		return new ResponseEntity<Map<String, List<WrongAnswerAll>>>(map, HttpStatus.OK);
		
	}
	
//	@GetMapping("test1")
//	public ResponseEntity<Student> tets1() {
//		
//		Student student = new Student();
//		
//		student.setLoginId("dd");
//		student.setPassword("pop");
//		student.setStudent_code(1);
//		student.setSaddress("서울");
//		student.setSname("홍길동");
//		student.setSphoneNumber("010-1234-5678");
//		
//		return new ResponseEntity<Student>(student, HttpStatus.OK);
//
//	}
	

}
