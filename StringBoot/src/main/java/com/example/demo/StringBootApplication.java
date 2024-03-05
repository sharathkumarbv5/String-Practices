package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringBootApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(StringBootApplication.class, args);
	}

}
