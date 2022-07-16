package com.example.demo.aspect;

import java.util.List;

import com.example.demo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	@After("execution(* com.example.demo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {

		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @After (finally) on method: "
				+ method);

	}
	@AfterThrowing(
			pointcut="execution(* com.example.demo.dao.AccountDAO.findAccounts(..))",
			throwing="theExc")
	public void afterThrowingFindAccountsAdvice(
			JoinPoint theJoinPoint, Throwable theExc) {
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);

		System.out.println("\n=====>>> The exception is: " + theExc);
	}

	@AfterReturning(
			pointcut="execution(* com.example.demo.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(
					JoinPoint theJoinPoint, List<Account> result) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
				
		System.out.println("\n=====>>> result is: " + result);
		

		convertAccountNamesToUpperCase(result);

		System.out.println("\n=====>>> result is: " + result);
		
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		for (Account tempAccount : result) {
			String theUpperName = tempAccount.getName().toUpperCase();
			
			tempAccount.setName(theUpperName);
		}

	}

}










