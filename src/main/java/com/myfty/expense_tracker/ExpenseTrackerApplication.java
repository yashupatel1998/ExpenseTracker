package com.myfty.expense_tracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation automatically configures the Spring application context
@SpringBootApplication
public class ExpenseTrackerApplication {

	public static void main(String[] args) {
		// Starts the application, including the embedded web server (Tomcat)
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}
}