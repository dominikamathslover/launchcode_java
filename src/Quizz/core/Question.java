package Quizz.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Question {
    protected String question;
    protected Answer[] answers;

    public Question(String aQuestion, Answer[] answers) {
        question = aQuestion;
        this.answers = answers;
        validate();
    }

    public String getQuestion() {
        return question;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    protected abstract void validate();

    public abstract boolean checkUserAnswer(String userAnswer);
}
