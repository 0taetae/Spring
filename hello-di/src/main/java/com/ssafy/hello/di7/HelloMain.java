package com.ssafy.hello.di7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssafy.hello.di7.controller.HelloController;

public class HelloMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ssafy/hello/di7/config/applicationContext.xml");
		
		HelloController controller = context.getBean("ctx", HelloController.class);
		System.out.println(controller.sayHello());
	}

}
