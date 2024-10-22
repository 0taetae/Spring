package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop02/applicationContext.xml");
		Person ob = (Person) factory.getBean("customer");
		ob.work();
	}

}
