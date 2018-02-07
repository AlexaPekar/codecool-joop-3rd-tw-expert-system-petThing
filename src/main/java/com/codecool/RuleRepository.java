package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RuleRepository {

    private List<Question> questions = new ArrayList<>();
    private Iterator<Question> questionIter;

    public RuleRepository(QuestionIterator questionIter) {
        this.questionIter = questionIter;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Iterator<Question> getIterator() {
        return questionIter;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
