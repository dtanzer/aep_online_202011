package com.example.evilfizzbuzz;

import java.util.Map;

public class Fizzbuzz implements Validator {

    @Override public void update(Map<Integer, String> numbers) {
        numbers.forEach((number, string) -> {
            if (isDivisibleBy3And5(number)) {
                numbers.put(number, "FizzBuzz");
            }
        });
    }

    public static boolean isDivisibleBy3(int number) {
        return isDivisibleByX(number, 3);
    }

    public static boolean isDivisibleBy5(int number) {
        return isDivisibleByX(number, 5);
    }

    public static boolean isDivisibleBy3And5(int number) {
        return isDivisibleBy3(number) && isDivisibleBy5(number);
    }

    public static boolean isDivisibleByX(int number, int divisor) {
        return number % divisor == 0;
    }
}
