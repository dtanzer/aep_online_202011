package com.example.aep201111.team01;

import java.util.Random;

public class RandomWordGenerator {

    private final Random random = new Random();

    public String getRandomWord(final WordRepository wordRepository) {
        final int randomIndex = this.random.nextInt(wordRepository.getWordsUppercase().size());
        return wordRepository.getWordsUppercase().get(randomIndex);
    }

}
