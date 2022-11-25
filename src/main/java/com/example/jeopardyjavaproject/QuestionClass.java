package com.example.jeopardyjavaproject;

public class QuestionClass {
    private String question;
    private String answer;
    private int value;

    public QuestionClass(String question, String answer, int value) {
        this.question = question;
        this.answer = answer;
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getValue() {
        return value;
    }
}
}
