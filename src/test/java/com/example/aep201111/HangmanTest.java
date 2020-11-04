package com.example.aep201111;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

class HangmanTest {
	@InjectMocks
	private Hangman hangman = new Hangman();

	private static final String missedLetter = "ž";

	@Test
	void pickRandomWordTest() {
		List<String> words = hangman.getWords();

		assertThat(hangman.getRandomWord()).isIn(words);
	}

	@Test
	void validateUserInput() {
		assertThat(hangman.validateUserInput(hangman.getRandomWord().substring(1))).isTrue();
		assertThat(hangman.validateUserInput(missedLetter)).isFalse();
	}

	@Test
	void checkScoreTest() {
		assertThat(hangman.getScore()).isZero();

		hangman.validateUserInput(hangman.getRandomWord().substring(1));

		assertThat(hangman.getScore()).isZero();

		assertThat(hangman.validateUserInput(missedLetter)).isFalse();

		assertThat(hangman.getScore()).isEqualTo(1);
	}

	@Test
	void showCorrectLettersTest(){
		assertThat(hangman.getFoundLetters()).isEmpty();
		assertThat(hangman.getMissed()).isEmpty();

		hangman.validateUserInput(hangman.getRandomWord().substring(1));
		assertThat(hangman.getFoundLetters()).contains(hangman.getRandomWord().substring(1));
		assertThat(hangman.getMissed()).isEmpty();

		hangman.validateUserInput(missedLetter);
		assertThat(hangman.getFoundLetters()).contains(hangman.getRandomWord().substring(1));
		assertThat(hangman.getFoundLetters()).hasSize(1);

		assertThat(hangman.getMissed()).contains(missedLetter);
		assertThat(hangman.getMissed()).hasSize(1);

	}

}
