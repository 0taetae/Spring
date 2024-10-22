package anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno02/bean.xml");
		MyFoodMgr ob = factory.getBean("myFoodMgr", MyFoodMgr.class);
		System.out.println(ob.toString());

	}

}
