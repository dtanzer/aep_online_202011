package com.example.evilfizzbuzz;

import java.util.Map;
import org.springframework.util.StringUtils;

public class Printer
{

    public String printMap(Map <Integer, String> myMap)
    {
        String output = "";

        int counter = 0;
        for (Map.Entry<Integer,String> entry : myMap.entrySet())
        {
            counter++;
            if (StringUtils.isEmpty(entry.getValue()))
            {
                output = output.concat(entry.getKey().toString());
            }
            else
            {
                output = output.concat(entry.getValue());
            }
            if (counter < myMap.size())
            {
                output = output.concat(", ");
            }
        }
        System.out.println(output);
        return output;
    }
}
