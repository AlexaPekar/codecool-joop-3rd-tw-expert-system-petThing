package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FactIteratorTest {

    List<Fact> testFacts;
    FactRepository.FactIterator factIter;
    Fact testFact;
    Fact secondTestFact;
    int counter = 0;

    @BeforeEach
    void setUp() {
        testFacts = new ArrayList<>();
        factIter = new FactRepository.FactIterator(testFacts);
        testFact = new Fact("snow leopard", "Snow leopard");
        secondTestFact = new Fact("uncia", "Uncia");
    }

    @Test
    void hasNext() {
        assertEquals(false, factIter.hasNext());
        testFacts.add(testFact);
        assertEquals(true, factIter.hasNext());
    }

    @Test
    void next() {
        assertThrows(NoSuchElementException.class, ()-> {
            factIter.next();
        });
        testFacts.add(testFact);
        testFacts.add(secondTestFact);
        assertEquals(testFact, factIter.next());
        assertEquals(secondTestFact, factIter.next());
    }

}