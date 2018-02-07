package com.codecool;

public class Question {

    String id;
    String question;
    Answer answer;


    public Question(String id, String question, Answer answer) {
        this.id=id;
        this.question=question;
        this.answer=answer;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public boolean getEvalutedAnswer(String input) throws Exception {
        return answer.evaluateAnswerByInput(input);
    }
}
