package com.DBproject.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.DBproject.user.model.Teacher;

@Repository
public interface TeacherDAO {
	
	public int insertTeacher(
			@Param("loginId") String loginId, 
			@Param("password") String password, 
			@Param("Tname") String Tname, 
			@Param("TphoneNumber") String TphoneNumber,
			@Param("Taddress") String Taddress,
			@Param("subject") String subject
			);

	public Teacher selectTeacher(
			@Param("loginId") String loginId,
			@Param("password") String password
			);

}
