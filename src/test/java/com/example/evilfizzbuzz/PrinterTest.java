package com.example.evilfizzbuzz;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest
{
    @Test
    public void testPrinter() {
        Map<Integer,String> myMap = new HashMap<>();

        myMap.put(1, null);
        myMap.put(2, "Wizz");
        myMap.put(3, "FizzWizz");
        myMap.put(4, "");
        myMap.put(5, "BuzzWizz");

        Printer printer = new Printer();
        String output = printer.printMap(myMap);
        assertEquals("1, Wizz, FizzWizz, 4, BuzzWizz", output);
    }
}
