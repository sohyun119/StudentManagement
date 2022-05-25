package com.DBproject.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DBproject.user.bo.TeacherBO;
import com.DBproject.user.model.Teacher;

@RestController
@RequestMapping("/teacher")
public class TeacherRestController {
	
	@Autowired
	private TeacherBO teacherBO;
	
	@PostMapping("/sign_up")
	public Map<String, String> signUp(
			@RequestParam("loginId") String loginId,
			@RequestParam("password") String password,
			@RequestParam("Tname") String Tname,
			@RequestParam("TphoneNumber") String TphoneNumber,
			@RequestParam("subject") String subject
			){
		
		int count = teacherBO.signUp(loginId, password, Tname, TphoneNumber, subject);
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		return map;
		
	}
	
	@PostMapping("/sign_in")
	public Map<String, String> signIn(
			@RequestParam("loginId") String loginId,
			@RequestParam("password") String password,
			HttpServletRequest request
			){
		Teacher teacher = teacherBO.signIn(loginId, password);
		Map<String, String> map = new HashMap<>();
		
		if(teacher != null) {
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
