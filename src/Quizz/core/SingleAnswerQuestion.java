package Quizz.core;

public abstract class SingleAnswerQuestion<T> extends Question<T> {
    final T answer;
    public SingleAnswerQuestion(String aQuestion, T anAnswer) {
        super(aQuestion);
        answer = anAnswer;
    }
}
