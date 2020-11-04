package com.example.aep201111.team01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomWordGeneratorTest {

    private final WordRepository wordRepository = new WordRepositoryImpl();

    @Test
    void givenListOfWords_whenRandomWordIsRequested_thenRandomWordIsReturned() {
        final RandomWordGenerator randomWordGenerator = new RandomWordGenerator();
        final String randomWord = randomWordGenerator.getRandomWord(this.wordRepository);
        assertThat(this.wordRepository.getWordsUppercase()).contains(randomWord);
    }


}
