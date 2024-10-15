package sample4;

public class MessageBeanImpl implements MessageBean{
	
	private String fruit;
	private int cost;
	
	

	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit+" MessageBeanImpl 생성자 호출");
	}


	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setCost 생성자 호출");
	}



	@Override
	public void sayHello() {
		System.out.println(fruit +"\t"+cost);  // xml를 통한 주입
	}

	@Override
	public void sayHello(String a, int b) {
		System.out.println(a +"\t"+b);  // 메서드에 대한 대입 
	}

}
