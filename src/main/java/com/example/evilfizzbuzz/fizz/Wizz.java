package com.example.evilfizzbuzz.fizz;

import com.example.evilfizzbuzz.Validator;

import java.util.Map;

public class Wizz implements Validator
{
    @Override
    public void update(final Map<Integer, String> numbers)
    {
        numbers.entrySet().forEach(e -> e.setValue(primeNumber(e.getKey())));
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
