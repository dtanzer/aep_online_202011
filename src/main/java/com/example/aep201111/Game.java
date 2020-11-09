package com.example.aep201111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    private final List<String> guesses = new ArrayList<>();
    private final String secretWord;
    private GameStatus status;

    enum GameStatus{
        RUNNING,
        LOST,
        WON
    }

    public Game(final String secretWord) {
        this.secretWord = secretWord;
        this.status = GameStatus.RUNNING;
    }

    public boolean isRunning() {
        return status == GameStatus.RUNNING;
    }

    public void guess(final String t) {
        if (status == GameStatus.RUNNING)
        {
            guesses.add(t);
            if(isLost())
            {
                status = GameStatus.LOST;
            }
            else if(isWon())
            {
                status = GameStatus.WON;
            }
        }
    }

    private long getWrongGuessesCount() {
        return guesses.stream().filter(guess -> !secretWord.contains(guess)).count();
    }

    public boolean isLost() {
        return getWrongGuessesCount() > 10;
    }

    public boolean isWon() {
        return Arrays.stream(secretWord.split("")).allMatch(guesses::contains);
    }
}
