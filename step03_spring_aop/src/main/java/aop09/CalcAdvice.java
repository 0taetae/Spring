package aop09;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component(value="advice")
@Aspect
public class CalcAdvice {
	@Pointcut("execution(public * *(..))")
	public void myCalc() {
	}
	
	@Around("myCalc()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("연산을 시작합니다.");
		try {
			pjp.proceed();
			
		}catch(Exception e) {}
		System.out.println("연산을 종료합니다.\n");
	}
	
	
	@AfterThrowing(pointcut="myCalc()", throwing="e")
	public void afterThrowing(Throwable e) {
		System.out.println("예외가 발생되었습니다");
		System.out.println(e.getMessage());
	}
}

//--------------------------------------------------------
/*
@Component(value="advice")
@Aspect
public class CalcAdvice {
	@Pointcut("execution(public * *(..))")
	public void myCalc() {
	}
	
	
	@Before("myCalc()")
	public void before() {
		System.out.println("연산을 시작합니다.");
	}
	
	@After("myCalc()")
	public void after() {
		System.out.println("연산을 종료합니다\n");
	}
	
	@AfterThrowing(pointcut="myCalc()", throwing="e")
	public void afterThrowing(Throwable e) {
		System.out.println("예외가 발생되었습니다");
		System.out.println(e.getMessage());
	}
}
*/
//------------------------------------------------------------
/*
@Component(value="advice")
@Aspect
public class CalcAdvice {
	@Before("execution(public * *(..))")
	public void before() {
		System.out.println("연산을 시작합니다.");
	}
	
	@After("execution(public * *(..))")
	public void after() {
		System.out.println("연산을 종료합니다\n");
	}
	
	@AfterThrowing(pointcut="execution(public * *(..))", throwing="e")
	public void afterThrowing(Throwable e) {
		System.out.println("예외가 발생되었습니다");
		System.out.println(e.getMessage());
	}
}
*/