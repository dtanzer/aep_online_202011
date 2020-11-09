package com.example.aep201111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    private final List<String> guesses = new ArrayList<>();
    private final String secretWord;

    public Game(final String secretWord) {
        this.secretWord = secretWord;
    }

    public boolean isRunning() {
        return !isLost() && !isWon();
    }

    public void guess(final String t) {
        this.guesses.add(t);
    }

    private long getWrongGuessesCount() {
        return this.guesses.stream().filter(guess -> !secretWord.contains(guess)).count();
    }

    public boolean isLost() {
        return getWrongGuessesCount() > 10;
    }

    public boolean isWon() {
        return Arrays.stream(secretWord.split("")).allMatch(this.guesses::contains);
    }
}
