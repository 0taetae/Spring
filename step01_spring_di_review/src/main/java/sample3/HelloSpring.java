package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample3/bean.xml");
		
		MessageBean bean = (MessageBean) factory.getBean("messageBean2");
		bean.sayHello("spring");

	}

}
