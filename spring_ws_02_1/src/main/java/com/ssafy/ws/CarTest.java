package com.ssafy.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String[] args) throws GasException {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/ssafy/ws/applicationContext.xml");
		
		// class -> resource
		// generic -> target
		Driver d = factory.getBean("driver",Driver.class);
		
		try {
			d.doSomething();
		}catch(GasException e) {
			
		}
		
		
	}
}
