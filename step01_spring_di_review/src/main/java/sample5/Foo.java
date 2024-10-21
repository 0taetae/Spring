package sample5;

public class Foo implements InterFoo {
	public Foo() {
		
	}
	public Foo(String str) {
		System.out.println(str);
	}
	public Foo(String str, int num) {
		System.out.println(str +" "+num);
	}
	public Foo(String str, int num, boolean flag) {
		System.out.println(str+" "+num+" "+flag);
	}
	public Foo(Bar bar) {
		System.out.println(bar);
	}
}
