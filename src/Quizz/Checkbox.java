package Quizz;

public class Checkbox extends  Question {
    private String[] positiveAnswers;
    private String[] negativeAnswers;


    public Checkbox(String aQuestion, String[] positiveAnswers, String[] negativeAnswers) {
        super(aQuestion);
        positiveAnswers= this.positiveAnswers;
        negativeAnswers=this.negativeAnswers;
    }

    public String[] getPositiveAnswers() {
        return positiveAnswers;
    }


    // mix odpowiedzi

    // można zrobić odpowiedz z dwoma parametrami
    // String + boolean


}
