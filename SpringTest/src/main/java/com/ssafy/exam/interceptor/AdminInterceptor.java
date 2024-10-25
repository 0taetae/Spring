package com.ssafy.exam.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafy.exam.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AdminInterceptor implements HandlerInterceptor{
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		MemberDto member = (MemberDto) session.getAttribute("memberInfo");
		
		String check = null;
		
		if(member != null) {
			check = member.getId();
		}
		
		// id가 admin으로 로그인된 사용자인지 확인
		if(member.getId() == null || !check.equals("admin")) {
			response.sendRedirect(request.getContextPath()+"/list");
			return false;
		}
		
		
		return true;
		
	}

}
