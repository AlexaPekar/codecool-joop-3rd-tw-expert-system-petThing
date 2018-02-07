package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Answer {

    Value value;
    List<Value> values = new ArrayList<>();


    public Answer() {
    }

    public boolean evaluateAnswerByInput(String input) {
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).getParam().equals(input)) {
                return values.get(i).getSelectionType();
            }
        }
        throw new NoSuchElementException();

    }

    public void addValue(Value value) {
        values.add(value);
    }
}
