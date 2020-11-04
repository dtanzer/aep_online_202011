package com.example.aep201111.team01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordRepositoryImpl implements WordRepository {

    private final List<String> words = Arrays.asList("Cat", "Dog", "Mouse");

    @Override
    public List<String> getWordsUppercase() {
        return this.words.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

}
