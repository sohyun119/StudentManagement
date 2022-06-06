package com.DBproject.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DBproject.common.EncryptUtils;
import com.DBproject.user.dao.StudentDAO;
import com.DBproject.user.model.Student;

@Service
public class StudentBO {
	
	@Autowired
	private StudentDAO studentDAO;
	
	
	public int signUp(
			String loginId, String password, String Sname, String SphoneNumber, String Saddress
			) {
	
		return studentDAO.insertStudent(loginId, password, Sname, SphoneNumber,Saddress );
	}
	
	public Student signIn(
			String loginId, String password
			) {
		
		return studentDAO.selectStudent(loginId, password);
	}
	
	

}
