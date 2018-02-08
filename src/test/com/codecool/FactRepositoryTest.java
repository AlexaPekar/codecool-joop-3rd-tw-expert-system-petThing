package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactRepositoryTest {

    FactRepository testFactRepo;
    Fact testFact;
    Fact secondTestFact;
    //FactIterator factIter = new FactIterator();

    @BeforeEach
    void setUp() {
        testFactRepo = new FactRepository();
        testFact = new Fact("rattata", "Rattata");
        secondTestFact = new Fact("raichu","Raichu");
        testFactRepo.addFact(testFact);
    }

    @Test
    void addFact() {
        assertEquals(false, testFactRepo.getFacts().contains(secondTestFact));
        testFactRepo.addFact(secondTestFact);
        assertEquals(true, testFactRepo.getFacts().contains(secondTestFact));
    }

    @Test
    void getIterator() {
        //assertEquals(FactIterator.class, testFactRepo.getIterator().getClass());
    }

    @Test
    void getFacts() {
        assertEquals(testFact, testFactRepo.getFacts().get(0));
    }
}