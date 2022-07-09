package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSetterXML {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("With IoC, Setter Injection and XML beans");

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
						
		context.close();
	}

}






