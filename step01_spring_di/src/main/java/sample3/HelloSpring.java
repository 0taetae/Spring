package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링을 이용한 접근
public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample3/bean.xml");
		MessageBean bean=(MessageBean)factory.getBean("messageBean1");
		bean.sayHello(" 스프링!!");
//		
//		((ClassPathXmlApplicationContext)factory).close();
	}
}
