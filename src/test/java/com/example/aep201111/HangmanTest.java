package com.example.aep201111;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class HangmanTest {
	@InjectMocks
	private Hangman hangman = new Hangman();

	@Test
	void pickRandomWordTest() {
		List<String> words = hangman.getWords();

		assertThat(hangman.getRandomWord()).isIn(words);
	}

}
