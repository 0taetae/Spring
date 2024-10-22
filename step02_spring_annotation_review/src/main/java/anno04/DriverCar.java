package anno04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCar {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("anno04/bean.xml");
		
		Tire ob = factory.getBean("koreaTire",KoreaTire.class);
		System.out.println(ob.getBrand());
		
		Car car = factory.getBean("car",Car.class);
		car.drive();
	}

}
