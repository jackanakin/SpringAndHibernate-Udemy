package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloConfigAnnotation {

	public static void main(String[] args) {
		System.out.println("Spring with annotations configuration");

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach = context.getBean("soccerCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}


