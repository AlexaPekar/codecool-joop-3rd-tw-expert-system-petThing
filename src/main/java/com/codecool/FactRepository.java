package com.codecool;

import java.util.Iterator;
import java.util.List;

public class FactRepository {

    private List<Fact> facts;
    private Iterator<Fact> fact;

    public FactRepository() {
    }

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public Iterator<Fact> getIterator() {
        return fact;
    }
}
