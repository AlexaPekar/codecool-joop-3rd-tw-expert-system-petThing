package com.codecool;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        FactParser fParser = new FactParser();
        fParser.load("data/facts.xml");

        System.out.println(fParser.factsFromXML);
    }
}
