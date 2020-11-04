package com.example.aep201111;

import java.util.Arrays;
import java.util.List;

public class Hangman
{
    public static List<String> words = Arrays.asList("random", "word");

    public String getRandomWord()
    {
        return "random";
    }

    public static List<String> getWords()
    {
        return words;
    }
}
