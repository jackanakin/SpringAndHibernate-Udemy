package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoAnnotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoAnnotationsApplication.class, args);
		System.out.println("Spring with @Annotations");
	}

}
