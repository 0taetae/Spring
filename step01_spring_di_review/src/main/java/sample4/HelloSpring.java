package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/bean.xml");
		
		MessageBean bean = (MessageBean) factory.getBean("messageBean");
		
		bean.sayHello();
		bean.sayHello("banana", 1500);
	}
}
