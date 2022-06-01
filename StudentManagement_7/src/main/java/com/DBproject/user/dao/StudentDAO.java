package com.DBproject.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.DBproject.user.model.Student;

@Repository
public interface StudentDAO {
	
	public int insertStudent(
			@Param("loginId") String loginId, 
			@Param("password") String password, 
			@Param("Sname") String Sname, 
			@Param("SphoneNumber") String SphoneNumber,
			@Param("Saddress") String Saddress
			);

	public Student selectStudent(
			@Param("loginId") String loginId,
			@Param("password") String password
			);
	
	public int test(@Param("email") String email);
	
}
