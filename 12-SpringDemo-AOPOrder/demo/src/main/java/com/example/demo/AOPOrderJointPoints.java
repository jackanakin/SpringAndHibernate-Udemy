package com.example.demo;

import com.example.demo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPOrderJointPoints {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		context.close();
	}

}










