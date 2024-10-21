package sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample6/bean.xml");

		Emp b1 = factory.getBean("dev", Emp.class);
		System.out.println(b1.toString());

		Emp b2 = factory.getBean("eng", Emp.class);
		System.out.println(b2.toString());

	}

}
