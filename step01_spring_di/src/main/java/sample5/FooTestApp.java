package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTestApp {

	public static void main(String[] args) {
//		ApplicationContext factory = new ClassPathXmlApplicationContext("sample5/bean1.xml");
//		System.out.println("** Container 초기화 작업 **");
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample5/bean2.xml");
		System.out.println("** Container 초기화 작업 **");
		
		

	}

}
