package aop04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StartMain {
	public static void main(String[] args) {
		ApplicationContext factory=new GenericXmlApplicationContext("aop04/applicationContext.xml");
		
		Person p=(Person)factory.getBean(args[0]);  // customer or emp
		p.work();
	}
}
