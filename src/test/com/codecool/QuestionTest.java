package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    Question testQuest;
    Answer testAnsi;

    @BeforeEach
    void setUp() {
        testAnsi = new Answer();
        testAnsi.addValue(new SingleValue("kiscica", true));
        testAnsi.addValue(new SingleValue("kiskutya", false));
        testQuest = new Question("pet", "Is it a question?", testAnsi);
    }

    @Test
    void getId() {
        assertEquals("pet", testQuest.getId());
    }

    @Test
    void getQuestion() {
        assertEquals("Is it a question?", testQuest.getQuestion());
    }

    @Test
    void getAnswer() {
        assertEquals(testAnsi, testQuest.getAnswer());
    }

    @Test
    void getEvalutedAnswer() {
        assertEquals(true, testQuest.getEvalutedAnswer("kiscica"));
    }
}