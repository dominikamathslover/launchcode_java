package Quizz.core;

public class Answer {
    private final String label;
    private final boolean isCorrect;

    public Answer(String aLabel, boolean aIsCorrect){
        label=aLabel;
        isCorrect=aIsCorrect;
    }

    public String getLabel() {
        return label;
    }

    public boolean isCorrect() {
        return isCorrect;
    }



}
