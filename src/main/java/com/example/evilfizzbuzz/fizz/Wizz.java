package com.example.evilfizzbuzz.fizz;

import com.example.evilfizzbuzz.Validator;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Map;

public class Wizz implements Validator
{
    @Override
    public void update(final Map<Integer, String> numbers)
    {
        numbers.entrySet().forEach(e -> e.setValue(e.getValue() + primeNumber(e.getKey())));
    }

    private String primeNumber(int key)
    {
        boolean flag = false;

        for (int i = 2; i <= key / 2; ++i)
        {
            if (key % i == 0)
            {
                flag = true;
                break;
            }

        }
        if (!flag)
        {
            return "Wizz";
        }

        return "";
    }
}
