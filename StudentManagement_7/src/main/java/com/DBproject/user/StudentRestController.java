package com.DBproject.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DBproject.user.bo.StudentBO;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudentBO studentBO;
	
	
	@PostMapping("/sign_up")
	public Map<String, String> signUp(
			@RequestParam("loginId") String loginId,
			@RequestParam("password") String password,
			@RequestParam("name") String Sname,
			@RequestParam("phoneNumber") String SphoneNumber,
			@RequestParam("address") String Saddress
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
