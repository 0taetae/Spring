package sample5;

public class Foo implements InterFoo{
	
	
	
	public Foo() {
	}

	public Foo(String str) {
		System.out.println(str);
		System.out.println("-----------");
	}
	
	public Foo(int num, String str) {
		System.out.println(num+" "+str);
		System.out.println("-----------");
	}
	public Foo(String str, int num, boolean flag) {
		System.out.println(str+" "+num+" "+flag);
		System.out.println("-----------");
	}
	public Foo(Bar bar) {
		System.out.println(bar);
	}
	
}
