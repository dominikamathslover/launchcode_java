package Quizz.core;

public class TrueFalse extends SingleAnswerQuestion<Boolean> {
    private static final String YES = "YES";
    private static final String NO = "NO";

    public TrueFalse(String aQuestion, boolean anAnswer) {
        super(aQuestion, anAnswer);
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        userAnswer = userAnswer.toUpperCase();
        return switch (userAnswer) {
            case YES -> answer;
            case NO -> !answer;
            default -> throw new IllegalArgumentException("Answer invalid");
        };
    }
}
