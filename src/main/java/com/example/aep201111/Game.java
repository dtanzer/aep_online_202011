package com.example.aep201111;

import java.util.ArrayList;
import java.util.List;

public class Game
{
    private List<String> guesses = new ArrayList<>();
    private String secretWord;

    public Game(final String test)
    {
        this.secretWord=test;
    }

    public boolean isRunning()
    {
        return !isLost();
    }

    public void guess(final String t)
    {
        this.guesses.add(t);
    }

    private long getWrongGuesses(){
        return this.guesses.stream().filter(guess->!secretWord.contains(guess)).count();
    }
    public boolean isLost()
    {
        return getWrongGuesses() > 10;
    }
}
