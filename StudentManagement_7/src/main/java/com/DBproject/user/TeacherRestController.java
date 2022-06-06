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
			@RequestParam("name") String Tname,
			@RequestParam("phoneNumber") String TphoneNumber,
			@RequestParam("address") String Taddress,
			@RequestParam("subject") String subject
			){
		
		int count = teacherBO.signUp(loginId, password, Tname, TphoneNumber, Taddress, subject);
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		return map;
		
	}
	

}
