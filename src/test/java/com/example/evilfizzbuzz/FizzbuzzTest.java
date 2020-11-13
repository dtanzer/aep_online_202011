package com.example.evilfizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {



    @Test
    void isNumberDivisibleBy5(){
        assertTrue(Fizzbuzz.isDivisibleBy5(15));
    }

    @Test
    void isNumberDivisibleBy3(){
        assertTrue(Fizzbuzz.isDivisibleBy3(15));
    }

    @Test
    void isNumberDivisibleBy3And5() {
        assertTrue(Fizzbuzz.isDivisibleBy3And5(15));
    }

    @Test void areNumbersReplacedByFizzBuzz(){
        Validator validator = new Fizzbuzz();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "");
        map.put(3, "");
        map.put(5, "");
        map.put(15, "");
        map.put(30, "");

        validator.update(map);

        assertEquals(map.get(1), "");
        assertEquals(map.get(3), "");
        assertEquals(map.get(5), "");
        assertEquals(map.get(15), "FizzBuzz");
        assertEquals(map.get(30), "FizzBuzz");

    }

}
