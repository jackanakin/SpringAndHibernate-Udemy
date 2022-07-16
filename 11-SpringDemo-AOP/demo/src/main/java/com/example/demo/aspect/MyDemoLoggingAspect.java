package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class MyDemoLoggingAspect {
	@Pointcut("execution(* com.example.demo.dao.*.*(..))")
	private void forDaoPackage() {}

	// create pointcut for getter methods
	@Pointcut("execution(* com.example.demo.dao.*.get*(..))")
	private void getter() {}

	// create pointcut for setter methods
	@Pointcut("execution(* com.example.demo.dao.*.set*(..))")
	private void setter() {}

	// create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	@Pointcut("execution(* com.example.demo.dao.AccountDAO.*(..))")
	private void forAccountDaoPackage() {
	}

	@Pointcut("execution(* com.example.demo.dao.*.*(..))")
	private void forAllDaoPackage() {
	}

	@Before("forAllDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on method");
	}

	@Before("forAccountDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API analytics");
	}
}










