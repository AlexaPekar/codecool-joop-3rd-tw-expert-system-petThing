package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleParserTest {

    RuleParser rParser;
    RuleRepository rRepo;

    @BeforeEach
    void setUp() {
        rRepo = new RuleRepository();
        rParser = new RuleParser(rRepo);
    }

    @Test
    void getRuleRepository() {
        rParser.load("data/rules.xml");
        assertEquals("Do you live in a (house) or a (flat)?",rParser.getRuleRepository().getQuestions().get(0).getQuestion());
    }

    @Test
    void load() {
        rParser.load("data/rules.xml");
        assertEquals("Do you have a lot of free time?(yes/no)",rParser.getRuleRepository().getQuestions().get(1).getQuestion());
        assertEquals("money",rParser.getRuleRepository().getQuestions().get(2).getId());
    }
}