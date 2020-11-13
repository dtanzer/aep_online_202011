package com.example.aep201111;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aep202011Application {

	public static void main(String[] args) {
		SpringApplication.run(Aep202011Application.class, args);

		System.out.println("seas");

		System.out.println("BasePrice:");
		String baseprice = System.console().readLine();

		System.out.println("Total Price: 1200");

	}

}
