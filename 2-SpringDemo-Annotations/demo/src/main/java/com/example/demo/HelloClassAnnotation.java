package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClassAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println("Spring with annotations with default @Component name");
		System.out.println(theCoach.getDailyWorkout());
				
		context.close();
	}
}


