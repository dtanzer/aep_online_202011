package com.example.aep201111;

import java.util.ArrayList;
import java.util.List;

public class Game
{
    private boolean lost = false;
    private List<String> guesses;

    public Game()
    {
        this.guesses = new ArrayList<>();
    }

    public Game(final String test)
    {
        this();
    }

    public boolean isRunning()
    {
        return !this.lost;
    }

    public void guess(final String t)
    {
        this.guesses.add(t);

        this.lost = true;
    }

    public boolean isLost()
    {
        return this.guesses.size() > 10;
    }
}
