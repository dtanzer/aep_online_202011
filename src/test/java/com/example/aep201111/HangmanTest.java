package com.example.aep201111;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HangmanTest {

	private Game game = new Game();

	@Test
	void isGameRunning()
	{
		assertTrue(game.isRunning());
	}

}
