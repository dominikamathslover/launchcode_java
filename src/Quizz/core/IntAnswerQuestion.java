package Quizz.core;

public class IntAnswerQuestion extends SingleAnswerQuestion<Integer> {
    public IntAnswerQuestion(String aQuestion, Integer anAnswer) {
        super(aQuestion, anAnswer);
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        return answer.equals(Integer.parseInt(userAnswer));
    }
}
