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

	@Test
	void validateUserInput() {
		assertThat(hangman.validateUserInput(hangman.getRandomWord().substring(1))).isTrue();
		assertThat(hangman.validateUserInput("ž")).isFalse();
	}

	@Test
	void checkScoreTest() {
		assertThat(hangman.getScore()).isZero();

		hangman.validateUserInput(hangman.getRandomWord().substring(1));

		assertThat(hangman.getScore()).isZero();

		assertThat(hangman.validateUserInput("ž")).isFalse();

		assertThat(hangman.getScore()).isEqualTo(1);
	}

}
