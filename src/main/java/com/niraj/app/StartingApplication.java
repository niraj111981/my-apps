package com.niraj.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.niraj.app"})
@SpringBootApplication
@EnableAutoConfiguration//(exclude = { DataSourceAutoConfiguration.class })
//@EnableScheduling
public class StartingApplication {

	public static void main(String[] args) {
		System.out.println("My Application is starting!");

		SpringApplication.run(StartingApplication.class, args);
		

		System.out.println("My Application is started!");
	}
	
}
