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

import com.DBproject.user.bo.StudentBO;
import com.DBproject.user.model.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudentBO studentBO;
	
	@PostMapping("/sign_up")
	public Map<String, String> signUp(
			@RequestParam("loginId") String loginId,
			@RequestParam("password") String password,
			@RequestParam("Sname") String Sname,
			@RequestParam("SphoneNumber") String SphoneNumber,
			@RequestParam("Saddress") String Saddress
			){
		
		int count = studentBO.signUp(loginId, password, Sname, SphoneNumber, Saddress);
		
		Map<String, String> map = new HashMap<>();
		
		if(count == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		return map;
		
	}
	
	
	
	

}
