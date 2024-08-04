package Quizz;

public class MultipleChoice extends  Question{
    private String positiveAnswer;
    private String[] negativeAnswers;

    public MultipleChoice(String aQuestion, String positiveAnswer, String[] negativeAnswers) {
        super(aQuestion);
        positiveAnswer=this. positiveAnswer;
        negativeAnswers=this.negativeAnswers;
    }

    public String getPositiveAnswer() {
        return positiveAnswer;
    }

    // zestaw odpowiedzi do wyboru
    // JEDNA poprawna odpowiedz z wprowadzonych
    // zestaw niepoprawnych odpowiedzi
    // można zrobić odpowiedz z dwoma parametrami
    // String + boolean 

}
