package anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno01/bean.xml");
		
		MyFoodMgr ob = factory.getBean("myFood",MyFoodMgr.class);
		System.out.println(ob);

	}

}
