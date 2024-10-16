package aop09;

import org.springframework.stereotype.Component;

@Component(value="calc")
public class CalcMethod {
	public void sum(int a, int b) {
		System.out.println(a+" + " + b + " = " +(a+b) );
	}
	
	public void divi(int a, int b) {
		try {
			System.out.println(a + " / " + b + " = " + (a/b));
			
		}catch(Exception e) {
			throw new RuntimeException("0으로 나눌수 없음");
		}
	}
}
