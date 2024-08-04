package Quizz;

public abstract class Question {

    String question;

    public Question(String aQuestion) {
        question = aQuestion;
    }

    public void getQuestion() {
        System.out.println(question);
    }

}
