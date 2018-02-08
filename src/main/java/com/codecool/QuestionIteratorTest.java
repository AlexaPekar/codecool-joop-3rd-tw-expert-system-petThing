package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QuestionIteratorTest {

    RuleRepository rRepo;
    List<Question> testQuestions;
    Question testQuest;
    Question secondTestQuest;
    Answer testAnswer = new Answer();
    Answer secondTestAnswer = new Answer();


    @BeforeEach
    void setUp() {
        rRepo = new RuleRepository();
        testQuestions = new ArrayList<>();
        testQuest = new Question("test", "Is it a test?", testAnswer);
        secondTestQuest = new Question("secondTest", "Is it a secondTest", secondTestAnswer);
    }

    @Test
    void hasNext() {
        assertEquals(false, rRepo.getIterator().hasNext());
        testQuestions.add(testQuest);
        assertEquals(true, rRepo.getIterator().hasNext());
    }

    @Test
    void next() {
        assertThrows(NoSuchElementException.class, ()-> {
            rRepo.getIterator().next();
        });
        testQuestions.add(testQuest);
        testQuestions.add(secondTestQuest);
        assertEquals(testQuest, rRepo.getIterator().next());
        assertEquals(secondTestQuest, rRepo.getIterator().next());
    }
}