package Quizz.core;

public class TrueFalse extends SingleAnswerQuestion<Boolean> {

    public TrueFalse(String aQuestion, boolean answer) {
        super(aQuestion, answer);
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        userAnswer = userAnswer.toUpperCase();
        return switch (userAnswer) {
            case "YES" -> answer;
            case "NO" -> !answer;
            default -> throw new IllegalArgumentException("Answer invalid");
        };
    }
}
