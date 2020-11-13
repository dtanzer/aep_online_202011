package com.example.evilfizzbuzz.fizz;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WizzTest
{
    @Test
    void primeTest()
    {
        Wizz wizz = new Wizz();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "");
        map.put(2, "");
        map.put(4, "");
        map.put(3, "Fizz");

        wizz.update(map);

        assertTrue(map.get(1).equals("1"));
        assertTrue(map.get(2).equals("Wizz"));
        assertTrue(map.get(3).equals("FizzWizz"));
    }
}