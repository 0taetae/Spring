package com.ssafy.hello.di7.controller;

import com.ssafy.hello.di7.service.HelloService;

public class HelloController {
	
	private HelloService helloService;
//	private String name;
//	private int age;
	
//	public HelloController(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	public String sayHello() {
//		System.out.println(">>>>>>>>>>>>>" + name + "   " + age);
		return helloService.hello("안효인");
	}
	
}
