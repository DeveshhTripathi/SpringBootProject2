package com.example.SpringProject_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProject2Application {
	private static final Logger logger = LoggerFactory.getLogger(SpringProject2Application.class);



	public static void main(String[] args) {
		SpringApplication.run(SpringProject2Application.class, args);
		logger.info("Spring Boot Application Started!");

		
		Logger1.main(args);



	}
}

