package Quizz.core;

public abstract class Question<T> {
    protected final String question;

    public Question(String aQuestion) {
        question = aQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public abstract boolean checkUserAnswer(String userAnswer);
}
