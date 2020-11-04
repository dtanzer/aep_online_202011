package com.example.aep201111.team01;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class ResultPrintFormatterTest {

    private final ResultPrintFormatter resultPrintFormatter = new ResultPrintFormatter();

    @Test
    void givenWord_whenGuessedLettersContainsHits_thenOnlyHitLetterAreShown() {
        final String result = this.resultPrintFormatter.getResultPhrase("black", Arrays.asList('b', 'a', 'q'));
        assertThat(result).isEqualTo("b_a__");
    }

    @Test
    void givenWord_whenGuessedLettersContainsNoHits_thenNoLetterAreShown() {
        final String result = this.resultPrintFormatter.getResultPhrase("white", Arrays.asList('b', 'a', 'q'));
        assertThat(result).isEqualTo("_____");
    }

    @Test
    void givenWord_whenGuessedLettersContainsMultipleHits_thenOnlyHitLetterAreShown() {
        final String result = this.resultPrintFormatter.getResultPhrase("maintenance", Arrays.asList('a', 'e', 'q'));
        assertThat(result).isEqualTo("_a___e_a__e");
    }

    @Test
    void givenWord_whenGuessedLettersContainsSameChar_thenOnlyHitLetterAreShown() {
        final String result = this.resultPrintFormatter.getResultPhrase("cat", Arrays.asList('a', 'e', 'a'));
        assertThat(result).isEqualTo("_a_");
    }

}
