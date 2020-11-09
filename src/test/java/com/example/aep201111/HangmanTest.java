package com.example.aep201111;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest
{

    @Test
    void isGameRunningAtStart()
    {
        final Game game = new Game("dummy");
        assertSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    @Test
    void isGameLostAfterElevenWrongGuesses()
    {
        final Game game = new Game("test");
        this.doNGuesses(game, 11);

        assertSame(game.getGameStatus(), Game.GameStatus.LOST);
        assertNotSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }


    @Test
    void isGameNotLostAfterTenWrongGuessesAndStillRunning()
    {
        final Game game = new Game("test");
        this.doNGuesses(game, 10);

        assertNotSame(game.getGameStatus(), Game.GameStatus.LOST);
        assertSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    @Test
    void isGameNotLostAfterOneCorrectAndTenWrongGuesses()
    {
        final Game game = new Game("test");
        this.doNGuesses(game, 10);
        game.guess("t");

        assertNotSame(game.getGameStatus(), Game.GameStatus.LOST);
        assertSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    @Test
    void isGameWonAfterAllCorrectGuesses(){
        final Game game = new Game("test");
        game.guess("t");
        game.guess("e");
        game.guess("s");

        assertSame(game.getGameStatus(), Game.GameStatus.WON);
        assertNotSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    @Test
    void isGameWonAfterTenWrongAndAllCorrectGuesses()
    {
        final Game game = new Game("test");

        doNGuesses(game, 10);
        game.guess("t");
        game.guess("e");
        game.guess("s");

        assertSame(game.getGameStatus(), Game.GameStatus.WON);
        assertNotSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    @Test
    void isGameLostAfterElevenWrongAndAllCorrectGuesses()
    {
        final Game game = new Game("test");

        doNGuesses(game, 11);
        game.guess("t");
        game.guess("e");
        game.guess("s");

        assertNotSame(game.getGameStatus(), Game.GameStatus.WON);
        assertNotSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    @Test
    void isNotLostIfAlreadyWon()
    {
        final Game game = new Game("test");

        game.guess("t");
        game.guess("e");
        game.guess("s");
        doNGuesses(game, 11);

        assertNotSame(game.getGameStatus(), Game.GameStatus.LOST);
        assertSame(game.getGameStatus(), Game.GameStatus.WON);
        assertNotSame(game.getGameStatus(), Game.GameStatus.RUNNING);
    }

    private void doNGuesses(final Game game, final int n) {
        for (int i = 0; i < n; i++) {
            game.guess("x");
        }
    }
}
