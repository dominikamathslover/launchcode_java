package Quizz.core;

public class MultipleChoice extends OptionQuestion {

    public MultipleChoice(String aQuestion, Answer[] anAnswers) {
        super(aQuestion, anAnswers);

    }

    @Override
    protected void validate() {
        int countCorrect = 0;
        for (Answer answer : answers) {
            if (answer.isCorrect()) {
                countCorrect++;
            }
            if (countCorrect > 1) {
                throw new IllegalArgumentException("Answer configuration incorrect.");
            }
        }
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        for (Answer answer : answers) {
            if (answer.getLabel().equals(userAnswer)) {
                return answer.isCorrect();
            }
        }
        throw new IllegalArgumentException("Invalid answer");
    }

// zestaw odpowiedzi do wyboru
// JEDNA poprawna odpowiedz z wprowadzonych
// zestaw niepoprawnych odpowiedzi
// można zrobić odpowiedz z dwoma parametrami
// String + boolean

}
