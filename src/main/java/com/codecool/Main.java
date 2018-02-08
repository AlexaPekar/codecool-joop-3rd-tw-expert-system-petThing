package com.codecool;

import javafx.css.Rule;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        FactRepository fRepo = new FactRepository();
        FactParser fParser = new FactParser(fRepo);
        RuleRepository rRepo = new RuleRepository();
        RuleParser rParser = new RuleParser(rRepo);
        fParser.load("data/facts.xml");
        rParser.load("data/rules.xml");
        ESProvider esp = new ESProvider(fParser, rParser);

        esp.collectAnswers();
        System.out.println(esp.evaluate());




    }
}
