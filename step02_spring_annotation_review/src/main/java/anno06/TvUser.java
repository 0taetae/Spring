package anno06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno06/bean.xml");
		Tv ob = factory.getBean("samsung",Tv.class);
		
		ob.powerOn();
		
	}

}
