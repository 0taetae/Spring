package sample4;

public class MessageBeanImpl implements MessageBean {
	
	private String fruit;
	private int cost;
	
	
	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setter 호출");
	}

	public MessageBeanImpl(String fruit) {
		super();
		this.fruit = fruit;
		System.out.println(fruit+"생성자 호출 ");
	}

	@Override
	public void sayHello() {
		System.out.println(fruit+" "+cost);
		
	}

	@Override
	public void sayHello(String a, int b) {
		System.out.println(a+" "+b);
		
	}

}
