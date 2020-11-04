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
        Game game = new Game();
        assertTrue(game.isRunning());
    }

    @Test
    void isGameLostAfterElevenWrongGuesses()
    {
        Game game = new Game("test");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");
        game.guess("x");

        assertTrue(game.isLost());
        assertFalse(game.isRunning());
    }

    @Disabled
    @Test
    void isGameNotLostAfterTenWrongGuessesAndStillRunning()
    {

    }
}
