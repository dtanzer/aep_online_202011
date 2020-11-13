package com.example.evilfizzbuzz;

import java.util.Map;
import org.springframework.util.StringUtils;

public class Printer
{

    public String printMap(Map <Integer, String> myMap)
    {
        String output = "";
        for (Map.Entry<Integer,String> entry : myMap.entrySet())
        {
            if (StringUtils.isEmpty(entry.getValue()))
            {
                output = output.concat(entry.getKey().toString());
            }
            else
            {
                output = output.concat(entry.getValue());
            }
            output = output.concat(", ");
        }
        System.out.println(output);
        return output;
    }
}
