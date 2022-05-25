package com.DBproject.common;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component // spring bin 에 class 저장하여 autowired 가능하도록
public class PermissionInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		
		// 로그인 정보
		HttpSession session = request.getSession();
		
		// 현재 요청한 uri (url 의 path)
		String uri = request.getRequestURI();
		
		// 로그인 상태
		if(session.getAttribute("student_code") != null) {
			if (uri.startsWith("/user")) {
				response.sendRedirect("study/analysis");
				return false; // 더 이상 이동이 없도록
			}
		}
		
		// 비로그인 상태
		else {
			if(uri.startsWith("/study")) {
				response.sendRedirect("/user/signin_view");
				return false;
			}
		}
		
		return true;
		
	}

}
