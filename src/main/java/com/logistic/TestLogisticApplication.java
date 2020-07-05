package com.logistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class TestLogisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestLogisticApplication.class, args);
	}

}
