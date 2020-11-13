package com.example.evilfizzbuzz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EvilFizzBuzz
{
    private List<Validator> validators = new ArrayList<>();

    public EvilFizzBuzz()
    {

        // generate numbers

        // add fizz

        // add buzz

        // add wizz

        // combine fizz & buzz & wizz

        // output

    }

    public Map<Integer, String> generateNumbers(int start, int end)
    {
        Map<Integer, String> numbersMap = new LinkedHashMap<>();
        for (int i = start; i <= end; i++)
        {
            numbersMap.put(i, "");
        }

        return numbersMap;
    }

    public void addValidator(Validator validator)
    {
        validators.add(validator);
    }

    public void runValidators(Map<Integer, String> numbersMap)
    {
        for (Validator validator : validators)
        {
            validator.update(numbersMap);
        }
    }
}
