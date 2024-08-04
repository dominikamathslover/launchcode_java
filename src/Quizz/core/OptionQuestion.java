package Quizz.core;

public abstract class OptionQuestion extends Question<String> {
    protected Answer[] answers;

    public OptionQuestion(String aQuestion, Answer[] answers) {
        super(aQuestion);
        this.answers = answers;
        validate();
    }

    public Answer[] getAnswers() {
        return answers;
    }

    protected abstract void validate();
}
