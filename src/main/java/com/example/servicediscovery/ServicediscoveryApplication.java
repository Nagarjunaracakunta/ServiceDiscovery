package com.example.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicediscoveryApplication {

	public static void main(String[] args) {
		System.out.println("Starting Eureka Server...");
		System.out.println("Feature one implemented");
		SpringApplication.run(ServicediscoveryApplication.class, args);
	}

}
