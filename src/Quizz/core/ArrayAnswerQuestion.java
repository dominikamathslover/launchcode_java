package Quizz.core;

import java.util.Arrays;

public class ArrayAnswerQuestion extends SingleAnswerQuestion<String[]>{
    public ArrayAnswerQuestion(String aQuestion, String[] anAnswer) {
        super(aQuestion, anAnswer);
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        return Arrays.toString(answer).equals(userAnswer);
    }
}
