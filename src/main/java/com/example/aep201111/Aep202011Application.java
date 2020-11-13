package com.example.aep201111;

import com.example.evilfizzbuzz.Buzz;
import com.example.evilfizzbuzz.EvilFizzBuzz;
import com.example.evilfizzbuzz.Fizzbuzz;
import com.example.evilfizzbuzz.Printer;
import com.example.evilfizzbuzz.fizz.Fizz;
import com.example.evilfizzbuzz.fizz.Wizz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class Aep202011Application {

	public static void main(String[] args) {
		SpringApplication.run(Aep202011Application.class, args);

		EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
		Map<Integer, String> numbersMap = evilFizzBuzz.generateNumbers(1, 100);
		evilFizzBuzz.addValidator(new Fizz());
		evilFizzBuzz.addValidator(new Buzz());
		evilFizzBuzz.addValidator(new Fizzbuzz());
		evilFizzBuzz.addValidator(new Wizz());

		evilFizzBuzz.runValidators(numbersMap);
		Printer printer = new Printer();
		printer.printMap(numbersMap);
	}
}
