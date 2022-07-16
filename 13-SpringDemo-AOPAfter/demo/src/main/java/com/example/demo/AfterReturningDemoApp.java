package com.example.demo;

import java.util.List;

import com.example.demo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");
		
		context.close();
	}

}










