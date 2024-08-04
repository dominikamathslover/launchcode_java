package Quizz.core;

import java.util.HashSet;
import java.util.List;

public class Checkbox extends OptionQuestion {
    private static final String COMMA_SEPARATOR = ",";

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
    }

    @Override
    public boolean checkUserAnswer(String userAnswer) {
        HashSet<String> answerHashSet = new HashSet<>(List.of(userAnswer.split(COMMA_SEPARATOR)));
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
