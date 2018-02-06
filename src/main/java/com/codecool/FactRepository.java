package com.codecool;

import java.util.Iterator;
import java.util.List;

public class FactRepository {

    private List<Fact> facts;
    private Iterator<Fact> factIter;

    public FactRepository(FactIterator factIter) {
        this.factIter=factIter;
    }

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public Iterator<Fact> getIterator() {
        return factIter;
    }
}
