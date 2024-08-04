package Quizz.core;

public class Quiz {
    Question<?>[] questions;
    // lista pytań
    // możliwość dodania pytan
    // wynik testu

    public Quiz(Question<?>[] aQuestions) {
        questions = aQuestions;
    }

    public Question<?>[] getQuestions() {
        return questions;
    }
}
