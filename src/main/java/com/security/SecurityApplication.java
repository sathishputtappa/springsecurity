package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		System.out.println("Before application starts!!");
		SpringApplication.run(SecurityApplication.class, args);
		System.out.println("Spring boot authentication application started!!");
	}

}
