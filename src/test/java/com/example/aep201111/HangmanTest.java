package com.example.aep201111;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class HangmanTest {

	@InjectMocks
	private Hangman hangman;


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
