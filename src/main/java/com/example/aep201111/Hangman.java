package com.example.aep201111;

import java.util.Arrays;
import java.util.List;

public class Hangman
{
    public static List<String> words = Arrays.asList("random", "word");
    private Integer score = 0;

    public String getRandomWord()
    {
        return "random";
    }

    public static List<String> getWords()
    {
        return words;
    }

    public boolean validateUserInput(String word){
        if(getRandomWord().contains(word)){
            return true;
        }

        score++;
        return false;
    }

    public Integer getScore()
    {
        return score;
    }
}
