package com.ssafy.hello.di8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ssafy.hello.di8.service.HelloService;

//@Component
@Controller(value = "ctrl")
public class HelloController {
	
//	@Autowired
	private final HelloService helloService;
//	private String name;
//	private int age;
	
//	public HelloController(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
//	@Autowired
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	public String sayHello() {
//		System.out.println(">>>>>>>>>>>>>" + name + "   " + age);
		return helloService.hello("안효인");
	}
	
}
