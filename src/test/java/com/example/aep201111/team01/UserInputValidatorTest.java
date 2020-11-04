package com.example.aep201111.team01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class UserInputValidatorTest {

    private static final String EXAMPLE_WORD = "dog";

    private final UserInputValidator userInputValidator = new UserInputValidator();

    @Test
    void givenAnExampleWord_whenUserInputIsContained_thenReturnsTrue() {
        final boolean inputOk = this.userInputValidator.isCharContained('o', EXAMPLE_WORD);
        assertThat(inputOk).isTrue();
    }

    @Test
    void givenAnExampleWord_whenUserInputIsNotContained_thenReturnsFalse() {
        final boolean inputOk = this.userInputValidator.isCharContained('y', EXAMPLE_WORD);
        assertThat(inputOk).isFalse();
    }

}
