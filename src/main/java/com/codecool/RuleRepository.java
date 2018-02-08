package com.codecool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class RuleRepository {

    private List<Question> questions = new ArrayList<>();
    private Iterator<Question> questionIter;

    public RuleRepository() {
        this.questionIter = new QuestionIterator();
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


    class QuestionIterator implements Iterator<Question> {

        int counter = 0;

        @Override
        public boolean hasNext() {
            if (counter >= questions.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Question next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                Question tempQuestion = questions.get(counter);
                counter++;
                return tempQuestion;
            }
        }
    }
}

