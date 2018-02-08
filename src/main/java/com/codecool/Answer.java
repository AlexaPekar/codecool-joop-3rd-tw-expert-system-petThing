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
        for (Value value1 : values) {
            if (value1.getParam().equals(input)) {
                return value1.getSelectionType();
            }
        }
        throw new NoSuchElementException();

    }

    public void addValue(Value value) {
        values.add(value);
    }
}
