package anno04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Tire tire;
	
	public void drive() {
		System.out.println(tire.getBrand()+"로 만들어짐");
	}
}
