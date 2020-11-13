package com.example.aep201111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aep202011Application {

	public static void main(String[] args) throws IOException
	{
		SpringApplication.run(Aep202011Application.class, args);

		System.out.println("seas");

		System.out.println("BasePrice:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String baseprice = reader.readLine();

		System.out.println("Quantity:");
		String quantity = reader.readLine();

		int totalNetPrice = Integer.valueOf(baseprice) * Integer.valueOf(quantity);
		System.out.println("Total Net Price: " + totalNetPrice);

	}

}
