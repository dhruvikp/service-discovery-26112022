package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscovery26112022Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscovery26112022Application.class, args);
	}

}