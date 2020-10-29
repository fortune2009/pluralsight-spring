package com.example.pluralsighttdge.fundamentals;

import com.example.pluralsighttdge.fundamentals.entity.Application;
import com.example.pluralsighttdge.fundamentals.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FundamentalsApplication {

//	private static final Logger log = LoggerFactory.getLogger(FundamentalsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(ApplicationRepository repository){
//		return (args) -> {
//			repository.save(new Application("Trackzilla", "fortune.daivd",
//					"Application for tracking bugs."));
//			repository.save(new Application("Expenses", "mary.jones",
//					"Application to track expense reports"));
//			repository.save(new Application("Notifications", "jones.jay",
//					"Application to send alerts and notifications to users"));
//
//			for(Application application : repository.findAll()){
//				log.info("The application is: " + application.toString());
//			}
//		};
//	}
}