package com.example.SpringProject_2;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootApplication
public class SpringProject2Application {
	private static final Logger logger = LoggerFactory.getLogger(SpringProject2Application.class);

	@Autowired
	private EmployeeBean employeeBean;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringProject2Application.class, args);
		SpringApplication.run(SpringProject2Application.class, args);
		logger.info("Spring Boot Application Started!");
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		employee.displayInfo();
		Logger1.main(args);



	}
}

