package com.example.aep201111;

public class Game
{
    private boolean lost = false;

    public Game()
    {

    }

    public Game(String test)
    {
    }

    public boolean isRunning()
    {
        return !lost;
    }

    public void guess(String t)
    {
        this.lost = true;
    }

    public boolean isLost()
    {
        return lost;
    }
}
