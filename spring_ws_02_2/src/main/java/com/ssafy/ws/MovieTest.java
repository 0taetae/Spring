package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {
	public static void main(String[] args)  {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/ssafy/ws/applicationContext.xml");
		
		Audience p = factory.getBean("audience",Audience.class);
		try {
			p.doSomething();
		}catch(CallException e) {
			
		}

	}
}
