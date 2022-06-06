package com.DBproject.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/signup_view/student")
	public String SignUpStudent() {
		return "user/signUpView_student";
	}
	
	
	@GetMapping("/signup_view/teacher")
	public String SignUpTeacher() {
		return "user/signUpView_teacher";
	}
	
	@GetMapping("/signin_view")
	public String SignIn() {
		return "user/signInView";
	}
	

}
