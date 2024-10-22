package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class SessionConfirmInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("preHandle() 실행");
		//권한이 있는 경우
		if(request.getSession().getAttribute("userInfo")!=null) return true;
		
		//권한이 없는 경우
		request.getRequestDispatcher("/WEB-INF/views/error401.jsp").forward(request,response);
		return false;
	}
}
