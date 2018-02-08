package com.codecool;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    Answer testAnsi;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testAnsi = new Answer();
        testAnsi.addValue(new SingleValue("house", true));
        testAnsi.addValue(new SingleValue("flat", false));
    }

    @org.junit.jupiter.api.Test
    void evaluateAnswerByInput() {
        assertEquals(true, testAnsi.evaluateAnswerByInput("house"));
        assertEquals(false, testAnsi.evaluateAnswerByInput("flat"));
        assertThrows(NoSuchElementException.class, ()-> {
            testAnsi.evaluateAnswerByInput("bungalow");
        });
    }

    @org.junit.jupiter.api.Test
    void addValue() {
        SingleValue singVal = new SingleValue("kecske", true);
        assertEquals(false, testAnsi.values.contains(singVal));
        testAnsi.addValue(singVal);
        assertEquals(true, testAnsi.values.contains(singVal));
    }
}