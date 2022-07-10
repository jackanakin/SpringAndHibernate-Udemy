package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloScopeAnnotation {

	public static void main(String[] args) {
		SpringApplication.run(HelloScopeAnnotation.class, args);
		System.out.println("Spring with @Scope annotation");

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");

		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		TennisCoach theCoach2 = context.getBean("tennisCoach", TennisCoach.class);

		// check if they are the same
		boolean result = (theCoach == theCoach2);

		// print out the results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for theCoach2: " + theCoach2 + "\n");
	}

}
