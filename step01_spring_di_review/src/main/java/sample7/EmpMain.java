package sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("sample7/bean.xml");
		
		Developer b1=factory.getBean("dev", Developer.class);
		System.out.println(b1.toString());
		
		Engineer b2=factory.getBean("eng", Engineer.class);
		System.out.println(b2.toString());
		
	}
}
/*
[출력]
이름 :강호동     급여 : 1500000원    부서 : 개발1팀(개발부)     
이름 :이순신     급여 : 2500000원    부서 : 기술1팀(기술부)      
*/