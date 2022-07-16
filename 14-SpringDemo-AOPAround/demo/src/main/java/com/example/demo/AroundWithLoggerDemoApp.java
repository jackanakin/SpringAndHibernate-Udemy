package com.example.demo;

import java.util.logging.Logger;

import com.example.demo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundWithLoggerDemoApp {

	private static Logger myLogger = 
					Logger.getLogger(AroundWithLoggerDemoApp.class.getName());
			
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService theFortuneService =
				context.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		myLogger.info("\nMain Program: AroundDemoApp");
		myLogger.info("Calling getFortune");
		String data = theFortuneService.getFortune();
		myLogger.info("\nMy fortune is: " + data);
		myLogger.info("Finished");
		
		context.close();
	}

}










