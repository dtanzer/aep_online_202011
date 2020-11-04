package com.example.aep201111;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.when;

class HangmanTest {

	private Hangman hangman = new Hangman();

	@Test
	void test_startGame()
	{
		fail("Do we need this one");
	}

	@Test
	void test_pickGameWord()
	{
		final String result = hangman.pickGameWord();

		assertThat(result).isInstanceOf(String.class);
		assertThat(result.length()).isGreaterThan(0);
	}

	@Test
	void test_currentStatusOfGameWord()
	{
		when(hangman.pickGameWord()).thenReturn("Dragan");
		String currentStatusOfGameWord = hangman.guess("d");
		assertThat(currentStatusOfGameWord).isEqualTo("d");
	}

	@Test
	void test_printGameWord()
	{
		fail("Implement the print word method");
	}

	@Test
	void test_attempt()
	{
		fail("Implement attempt");
	}
}
