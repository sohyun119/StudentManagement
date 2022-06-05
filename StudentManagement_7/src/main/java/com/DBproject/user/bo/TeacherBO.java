package com.DBproject.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DBproject.common.EncryptUtils;
import com.DBproject.user.dao.TeacherDAO;
import com.DBproject.user.model.Teacher;

@Service
public class TeacherBO {
	
	@Autowired
	private TeacherDAO teacherDAO;
	
	public int signUp(
			String loginId, String password, String Tname, String TphoneNumber,String Taddress, String subject
			) {
		
		return teacherDAO.insertTeacher(loginId, password, Tname, TphoneNumber,Taddress, subject);
	}
	
	public Teacher signIn(
			String loginId, String password
			) {
		
		return teacherDAO.selectTeacher(loginId, password);
	}

}
