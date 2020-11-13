package com.example.evilfizzbuzz;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Fizz {

    @Test
    public void testFizz() {
        final HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, "");
        }

        com.example.evilfizzbuzz.fizz.Fizz fizz = new com.example.evilfizzbuzz.fizz.Fizz();

        fizz.update(map);

        assertTrue(map.get(3).equals("Fizz"));
        assertTrue(map.get(6).equals("Fizz"));

    }

}
