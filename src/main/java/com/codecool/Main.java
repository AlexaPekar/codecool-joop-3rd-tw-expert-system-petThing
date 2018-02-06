package com.codecool;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        test t = new test();
        t.load("data/facts.xml");

        System.out.println(t.factsFromXML);
    }
}
