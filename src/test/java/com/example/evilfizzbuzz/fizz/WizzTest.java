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
        map.put(2, "");
        map.put(4, "");

        wizz.update(map);

        assertTrue(map.get(2).equals("Wizz"));
    }
}