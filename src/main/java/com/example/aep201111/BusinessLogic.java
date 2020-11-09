package com.example.aep201111;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BusinessLogic
{
    private List<String> dictionary = new ArrayList<>();

    public BusinessLogic()
    {
        dictionary.add("Programming");
        dictionary.add("Agile");
        dictionary.add("Scrum");
        dictionary.add("Training");
    }

    public String getRandomWord()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(dictionary.size());

        return dictionary.get(randomNumber);
    }

    public void printTheHint(String hint)
    {
        for (int i = 0; i < hint.length(); i++)
        {
            System.out.print("_");
        }
    }
}
