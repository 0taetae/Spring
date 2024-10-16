package com.ssafy.hello.di8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssafy.hello.di8.config.ApplicationConfig;
import com.ssafy.hello.di8.controller.HelloController;

public class HelloMain {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/ssafy/hello/di8/config/applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
//		HelloController controller = context.getBean("helloController", HelloController.class);
		HelloController controller = context.getBean("ctrl", HelloController.class);
		System.out.println(controller.sayHello());
	}

}
