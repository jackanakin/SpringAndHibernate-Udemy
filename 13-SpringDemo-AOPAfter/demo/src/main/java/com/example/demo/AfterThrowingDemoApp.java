package com.example.demo;

import java.util.List;

import com.example.demo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AfterThrowingDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> theAccounts = null;

		try {
			boolean tripWire = true;
			theAccounts = theAccountDAO.findAccounts(tripWire);
		}
		catch (Exception exc) {
			System.out.println("\n\nMain Program ... caught exception: " + exc);
		}

		System.out.println("\n\nMain Program: AfterThrowingDemoApp");
		System.out.println("----");

		context.close();
	}

}