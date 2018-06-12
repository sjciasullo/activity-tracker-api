package com.example.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ActivityTracker {

	public static void main(String[] args) {
		SpringApplication.run(ActivityTracker.class, args);
	}
}
