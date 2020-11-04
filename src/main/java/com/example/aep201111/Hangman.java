package com.example.aep201111;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hangman
{

    private static List<String> gameWords = Arrays.asList("One", "Two");

    public String pickGameWord()
    {
        final Random random = new Random();
        return gameWords.get(random.nextInt(gameWords.size()));
    }
}
