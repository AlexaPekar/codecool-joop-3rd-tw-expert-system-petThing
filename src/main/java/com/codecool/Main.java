package com.codecool;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        FactIterator fIter = new FactIterator();
        FactRepository fRepo = new FactRepository(fIter);
        FactParser fParser = new FactParser(fRepo);
        fParser.load("data/facts.xml");

        System.out.println(fRepo.getFacts().get(0).livingSpace);
        System.out.println(fRepo.getFacts().get(1).livingSpace);
        System.out.println(fRepo.getFacts().get(2).livingSpace);
        System.out.println(fRepo.getFacts().get(3).livingSpace);
        System.out.println(fRepo.getFacts().get(4).livingSpace);


    }
}
