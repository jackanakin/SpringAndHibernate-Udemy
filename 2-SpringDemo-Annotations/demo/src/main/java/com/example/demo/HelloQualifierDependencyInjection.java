package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloQualifierDependencyInjection {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
				
		context.close();
	}

}


