package com.example.aep201111;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HangmanTest
{

    @Test
    void isGameRunningAtStart()
    {
        final Game game = new Game();
        assertTrue(game.isRunning());
    }

    @Test
    void isGameLostAfterElevenWrongGuesses()
    {
        final Game game = new Game("test");
        this.doNGuesses(game, 11);

        assertTrue(game.isLost());
        assertFalse(game.isRunning());
    }


    @Test
    void isGameNotLostAfterTenWrongGuessesAndStillRunning()
    {
        final Game game = new Game("test");
        this.doNGuesses(game, 10);

        assertFalse(game.isLost());
        assertTrue(game.isRunning());
    }

    private void doNGuesses(final Game game, final int n) {
        for (int i = 0; i < n; i++) {
            game.guess("x");
        }
    }
}
