package com.example.aep201111;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HangmanTest {

	@Test
	void isGameRunningAtStart()
	{
		Game game = new Game();
		assertTrue(game.isRunning());
	}

}
