package anno05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno05/bean.xml");
		
		School ob = factory.getBean("school",School.class);
		System.out.println(ob.toString());
	}

}
