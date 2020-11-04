package com.example.aep201111.team01;

public class UserInputValidator {

    public boolean isCharContained(final char letter, final String word) {
        return word.indexOf(letter) != -1;
    }

}
