package sample5;

public class Foo implements InterFoo{
	
	public Foo() {
		System.out.println("Foo 기본 생성자");
	}
	public Foo(String str) {
		System.out.println(str);
	}
	public Foo(int num, String str) {
		System.out.println(num+" "+str);
	}
	public Foo(String str, int num, boolean flag) {
		System.out.println(str+" "+num+" "+flag);
	}
	public Foo(Bar bar) {
		System.out.println(bar);
	}
	
	

}
