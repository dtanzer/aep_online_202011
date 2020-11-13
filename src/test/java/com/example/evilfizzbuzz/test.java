package com.example.evilfizzbuzz;

import java.util.HashMap;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import com.example.evilfizzbuzz.fizz.Fizz;

public class test {

    @Test
    public void testietest() {
        final HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            integerStringHashMap.put(i, "");
        }

        Fizz fizz = new Fizz();

        fizz.update(integerStringHashMap);

    }

}
