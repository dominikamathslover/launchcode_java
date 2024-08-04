package Quizz.core;

public class TrueFalse extends Question {

    public TrueFalse(String aQuestion, boolean answer) {
        super(aQuestion, getAnswers(answer));
    }

    private static Answer[] getAnswers(boolean answer) {
        Answer answerYes = new Answer("YES", answer);
        Answer answerNo = new Answer("NO", !answer);

        return new Answer[]{answerYes, answerNo};
    }

    @Override
    protected void validate() {
        // do nothing for this subtype
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        userAnswer = userAnswer.toUpperCase();
        return switch (userAnswer) {
            case "YES" -> answers[0].isCorrect();
            case "NO" -> answers[1].isCorrect();
            default -> throw new IllegalArgumentException("Answer invalid");
        };
    }
}
