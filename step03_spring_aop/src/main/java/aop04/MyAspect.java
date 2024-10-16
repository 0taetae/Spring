package aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect{
	@Before("execution(public void aop04.*.work())")
	public void login(JoinPoint joinPoint) {
		System.out.println("로그인 처리");
	}
	
	@After("execution(public void aop04.*.work())")
	public void logout(JoinPoint joinPoint) {
		System.out.println("로그아웃 처리");
	}
}
