package aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class StartMain {

	public static void main(String[] args) {
		CustomerService customer = new CustomerService();
		EmpService emp = new EmpService();
		
		customer.work();
		System.out.println("-----------");
		emp.work();

	}

}
