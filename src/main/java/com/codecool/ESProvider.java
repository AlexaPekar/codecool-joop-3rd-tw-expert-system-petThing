package com.codecool;

import java.util.*;

public class ESProvider {

    Map<String, Boolean> map = new HashMap<>();
    TreeMap<Integer, String> matches = new TreeMap<>();
    FactParser factParser;
    RuleParser ruleParser;
    boolean temp;

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        this.factParser = factParser;
        this.ruleParser = ruleParser;
    }

    public void collectAnswers() {

        while (ruleParser.rRepo.getIterator().hasNext()) {
            Question q = ruleParser.rRepo.getIterator().next();
            while (true) {
                try {
                    System.out.println(q.getQuestion());
                    String usrInput = new Scanner(System.in).next();
                    boolean tempValue = q.getEvalutedAnswer(usrInput);
                    map.put(q.getId(), tempValue);
                    break;
                } catch (NoSuchElementException e) {
                    System.out.println("Wrong input");
                }
            }
        }
    }

    public boolean getAnswerByQuestion(String questionId) {
        for (String key : map.keySet()) {
            if (key.equals(questionId)) {
                temp = map.get(key);
            }
        }
        return temp;
    }

    public String evaluate() {
        while (factParser.fRepo.getIterator().hasNext()) {
            int counter = 0;
            Fact f = factParser.fRepo.getIterator().next();
            for (String s: f.getIdSet()) {
                if (getAnswerByQuestion(s) == f.getValueById(s)) {
                    counter++;
                }
            }
            matches.put(counter, f.getDescription());
        }
        System.out.println(matches.lastKey());
        return matches.get(matches.lastKey());
    }
}
