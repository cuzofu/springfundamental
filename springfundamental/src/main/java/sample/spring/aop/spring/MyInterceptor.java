package sample.spring.aop.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyInterceptor {

	@Pointcut("execution (* sample.spring.aop.*.*(..))")
	public void anyMethod() {
	}

	@Before("anyMethod()")
	public void before() {
		System.out.println("Before");
	}

	@After("anyMethod()")
	public void after() {
		System.out.println("After");
	}

	@Around("anyMethod()")
	public void Around(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		pjp.proceed();
		long end = System.currentTimeMillis();
		System.out.println("执行时间：" + (end - start));
	}

	@Before("anyMethod() && args(name)")
	public void before(String name) {
		System.out.println("This name is " + name);
	}

	@AfterReturning(pointcut = "anyMethod()", returning = "result")
	public void afterReturning(String result) {
		System.out.println("The value is " + result);
	}

	@AfterThrowing(pointcut = "anyMethod()", throwing = "e")
	public void afterThrowing(Exception e) {
		e.printStackTrace();
	}

}
