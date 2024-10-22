package anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno03/bean.xml");
		
		Engineer ob = factory.getBean("engineer", Engineer.class);
		System.out.println(ob.toString());
				

	}

}
