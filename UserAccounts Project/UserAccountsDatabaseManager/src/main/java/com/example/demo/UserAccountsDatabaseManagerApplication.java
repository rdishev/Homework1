package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class UserAccountsDatabaseManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAccountsDatabaseManagerApplication.class, args);
	}

}
