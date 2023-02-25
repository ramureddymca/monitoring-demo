package com.monitoring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MonitoringDemoApplication {

	@GetMapping
	public String message(){
		return "Welcome Java";
	}
	public static void main(String[] args) {
		SpringApplication.run(MonitoringDemoApplication.class, args);
	}
}
