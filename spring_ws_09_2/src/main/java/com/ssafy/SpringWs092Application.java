package com.ssafy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.ws.interceptor.SessionInterceptor;

@SpringBootApplication
@MapperScan(basePackages = "com.ssafy.ws.model.dao")
public class SpringWs092Application implements WebMvcConfigurer{
	
	@Autowired
	SessionInterceptor si;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(si).addPathPatterns("/regist");
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringWs092Application.class, args);
	}

}
