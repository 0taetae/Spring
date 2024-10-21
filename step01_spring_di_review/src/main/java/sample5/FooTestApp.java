package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooTestApp {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample5/bean.xml");
		
		InterFoo ob = (InterFoo) factory.getBean("f5");
		//System.out.println(ob);

	}

}
