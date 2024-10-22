package aop01;

public class StartMain {

	public static void main(String[] args) {
		CustomerService ob1 = new CustomerService();
		EmpService ob2 = new EmpService();
		ob1.work();
		ob2.work();
	}

}
