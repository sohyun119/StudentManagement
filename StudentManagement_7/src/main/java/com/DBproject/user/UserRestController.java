package com.DBproject.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DBproject.user.bo.StudentBO;
import com.DBproject.user.bo.TeacherBO;
import com.DBproject.user.model.Student;
import com.DBproject.user.model.Teacher;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private StudentBO studentBO;
	
	@Autowired
	private TeacherBO teacherBO;


	@PostMapping("/sign_in")
	public Map<String, String> signIn(
			@RequestParam("loginId") String loginId, @RequestParam("password") String password
			, HttpServletRequest request
			){
		
		Student student = studentBO.signIn(loginId, password);
		Teacher teacher = teacherBO.signIn(loginId, password);
		Map<String, String> map = new HashMap<>();
		
		if(student != null && teacher == null) {
			HttpSession session = request.getSession();
			session.setAttribute("Student_code", student.getStudent_code());
			session.setAttribute("Sname", student.getSname());
			
			map.put("result", "success");
		}
		else if(student == null && teacher != null){
			HttpSession session = request.getSession();
			session.setAttribute("Teacher_code", teacher.getTeacher_code());
			session.setAttribute("Tname", teacher.getTname());
			map.put("result", "success");
		}
		else {
			map.put("result", "fail");
		}
		
		return map;
		
		
	}
	
}
