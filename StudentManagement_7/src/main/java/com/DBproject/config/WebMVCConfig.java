package com.DBproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.DBproject.common.PermissionInterceptor;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer{
	
	@Autowired 
	PermissionInterceptor permissionInterceptor;
	
	// 인터셉터 설정으로 비정상 경로 접근 제한
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(permissionInterceptor)
//		.addPathPatterns("/**") // 모든path가 인터셉터 거치도록 
//		.excludePathPatterns("/static/**", "user/sign_out");
//	}
	
	

}
