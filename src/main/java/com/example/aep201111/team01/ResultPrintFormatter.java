package com.example.aep201111.team01;

import java.util.List;

public class ResultPrintFormatter {

    public String getResultPhrase(final String word, final List<Character> guessedLetters) {
        final StringBuilder output = new StringBuilder();
        for (final char letter : word.toCharArray()) {
            if (guessedLetters.contains(letter)) {
                output.append(letter);
            } else {
                output.append("_");
            }
        }
        return output.toString();
    }

}
