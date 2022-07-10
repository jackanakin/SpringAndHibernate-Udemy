package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSetterLiteralXML {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("With IoC, Setter Literal values and XML beans");

		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeam());
						
		context.close();
	}

}






