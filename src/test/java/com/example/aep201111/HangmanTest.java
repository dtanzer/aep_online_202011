package com.example.aep201111;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.fail;

public class HangmanTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp()
    {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testGetRandomWord()
    {
        BusinessLogic businessLogic = new BusinessLogic();
        Assertions.assertNotNull(businessLogic.getRandomWord());
    }

    @Test
    void testPrintTheHint()
    {
        String word = "Testing";
        BusinessLogic businessLogic = new BusinessLogic();

        businessLogic.printTheHint(word);
        AssertionErrors.assertEquals("Hit not printed correctly", "_______", outputStreamCaptor.toString());
    }

}
