package com.log.cts.LoggerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LoggerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerDemoApplication.class, args);
	}

}
