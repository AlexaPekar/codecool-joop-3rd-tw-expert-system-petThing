package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactParserTest {

    FactParser fParser;
    FactRepository fRepo;

    @BeforeEach
    void setUp() {
        fRepo = new FactRepository();
        fParser = new FactParser(fRepo);
    }

    @Test
    void getFactRepository() {
        fParser.load("data/facts.xml");
        assertEquals("Lynx",fParser.getFactRepository().getFacts().get(0).getDescription());

    }

    @Test
    void load() {
        fParser.load("data/facts.xml");
        assertEquals("UV Dog",fParser.getFactRepository().getFacts().get(1).getDescription());
        assertEquals(true,fParser.getFactRepository().getFacts().get(1).getValueById("money"));
    }
}