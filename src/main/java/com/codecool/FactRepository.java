package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FactRepository {


    private List<Fact> facts = new ArrayList<>();
    private Iterator<Fact> factIter;

    public FactRepository() {
        this.factIter = new FactIterator(facts);
    }

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public Iterator<Fact> getIterator() {
        return factIter;
    }

    public List<Fact> getFacts() {
        return facts;
    }



    static class FactIterator implements Iterator<Fact> {

        int counter = 0;
        private List<Fact> facts;

        public FactIterator(List<Fact> facts) {
            this.facts = facts;
        }


        @Override
        public boolean hasNext() {
            if (counter >= facts.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Fact next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                Fact tempFact = facts.get(counter);
                counter++;
                return tempFact;
            }
        }
    }
}
