package com.example.aep201111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hangman
{
    public static List<String> words = Arrays.asList("random", "word");
    public List<String> foundLetters = new ArrayList<>();
    public List<String> missed = new ArrayList<>();

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
            foundLetters.add(word);
            return true;
        }else {
            missed.add(word);
        }

        score++;
        return false;
    }

    public Integer getScore()
    {
        return score;
    }

    public List<String> getFoundLetters() {
        return foundLetters;
    }

    public List<String> getMissed() {
        return missed;
    }

}
