package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleRepositoryTest {

    RuleRepository testRuleRepo;
    Question testQuest;
    Question secondTestQuest;
    //QuestionIterator questIter = new QuestionIterator();

    @BeforeEach
    void setUp() {
        testRuleRepo = new RuleRepository();
        Answer testAnsi = new Answer();
        Answer secondTestAnsi = new Answer();
        testAnsi.addValue(new SingleValue("yapp", true));
        testAnsi.addValue(new SingleValue("nope", false));
        secondTestAnsi.addValue(new SingleValue("kiscica", true));
        secondTestAnsi.addValue(new SingleValue("kiskutya", false));
        testQuest = new Question("answer", "What is the answer?", testAnsi);
        secondTestQuest = new Question("pet", "Is this a question?", secondTestAnsi);
        testRuleRepo.addQuestion(testQuest);
    }

    @Test
    void addQuestion() {
        assertEquals(false, testRuleRepo.getQuestions().contains(secondTestQuest));
        testRuleRepo.addQuestion(secondTestQuest);
        assertEquals(true, testRuleRepo.getQuestions().contains(secondTestQuest));
    }


    @Test
    void getQuestions() {
        assertEquals(testQuest, testRuleRepo.getQuestions().get(0));
    }
}