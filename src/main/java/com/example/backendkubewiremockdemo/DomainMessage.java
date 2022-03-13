package com.example.backendkubewiremockdemo;

public class DomainMessage {

    private String answer;

    public DomainMessage() {
    }

    public DomainMessage(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "DomainMessage{" +
                "answer='" + answer + '\'' +
                '}';
    }
}
