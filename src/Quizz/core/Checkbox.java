package Quizz.core;

import java.util.HashSet;
import java.util.List;

public class Checkbox extends Question {
    private int countCorrect;

    public Checkbox(String aQuestion, Answer[] anAnswers) {
        super(aQuestion, anAnswers);
    }

    @Override
    protected void validate() {
        int aCountCorrect = 0;
        for (Answer answer : answers) {
            if (answer.isCorrect()) {
                aCountCorrect++;
            }
        }
        if (aCountCorrect == 0) {
            throw new IllegalArgumentException("Answer configuration incorrect.");
        }
        countCorrect = aCountCorrect;
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        // EXAMPLE: Berlin,Vienna,Prague,Lublin,Kiev,Bad Homburg

        HashSet<String> answerHashSet = new HashSet<String>(List.of(userAnswer.split(",")));
        boolean isOkay = true;

        if (answerHashSet.isEmpty())
            throw new IllegalArgumentException("Invalid answer");

        for (Answer answer : answers) {
            boolean wasInSet = answerHashSet.remove(answer.getLabel());
            isOkay = isOkay && wasInSet && answer.isCorrect();
        }

        if (!answerHashSet.isEmpty())
            throw new IllegalArgumentException("Invalid answer");

        return isOkay;
    }



}
