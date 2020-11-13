package com.example.aep201111;

import com.example.evilfizzbuzz.EvilFizzBuzz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Aep202011Application {

	public static void main(String[] args) {
		SpringApplication.run(Aep202011Application.class, args);

		EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
		Map<Integer, String> numbersMap = evilFizzBuzz.generateNumbers(1, 100);
//		evilFizzBuzz.addValidator();
//		evilFizzBuzz.addValidator();
//		evilFizzBuzz.addValidator();
//		evilFizzBuzz.addValidator();

		evilFizzBuzz.runValidators(numbersMap);
	}
}
