package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//스프링을 이용한 접근
public class HelloSpring {
	public static void main(String[] args) {
//		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/bean1.xml");
//		System.out.println("** Container 초기화 작업 **");
//		
//		MessageBean bean = (MessageBean) factory.getBean("messageBean");
//		bean.sayHello();  // 주입 (DI)
//		bean.sayHello("banana",1500);  // 대입 
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample4/bean2.xml");
		// c:fruit -> constructor-arg
		// p:cost -> property
		System.out.println("** container 초기화 작업 **");
		
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello();                //주입(DI)
		bean.sayHello("banana", 1500);  //대입
	}
}
