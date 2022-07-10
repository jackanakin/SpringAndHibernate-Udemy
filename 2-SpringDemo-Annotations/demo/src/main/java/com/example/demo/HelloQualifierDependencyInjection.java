package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloQualifierDependencyInjection {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");

		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//System.out.println(theCoach.getEmail());
		//System.out.println(theCoach.getTeam());

		context.close();
	}

}


