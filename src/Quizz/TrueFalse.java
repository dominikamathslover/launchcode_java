package Quizz;

public class TrueFalse extends  Question {
    private boolean answer = false;

    public TrueFalse(String aQuestion, boolean answer) {
        super(aQuestion);
        answer = this.answer;
    }

    public boolean isAnswer() {
        return answer;
    }


}
