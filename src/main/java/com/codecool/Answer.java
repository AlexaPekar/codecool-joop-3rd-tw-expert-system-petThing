package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Answer {

    Value value;
    List<Value> values = new ArrayList<>();


    public Answer() {
    }

    public boolean evaluateAnswerByInput(String input) throws Exception {
        boolean result = false;
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).getParam().equals(input)) {
                result = true;
            }
        }
        return result;
    }

    public void addValue(Value value) {
        values.add(value);
    }
}
