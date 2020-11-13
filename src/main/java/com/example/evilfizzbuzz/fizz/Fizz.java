package com.example.evilfizzbuzz.fizz;

import java.util.Map;

import com.example.evilfizzbuzz.Validator;

public class Fizz implements Validator {

    public static final String FIZZ = "Fizz";

    public Fizz() {
    }

    @Override
    public void update(final Map<Integer, String> numbers) {

        numbers.forEach((key, value) -> {

            if (key % 3 == 0) {
                numbers.put(key, FIZZ);
            }

        });

        numbers.put(0, "");

    }
}
