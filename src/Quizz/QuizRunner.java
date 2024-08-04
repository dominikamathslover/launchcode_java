package Quizz;

public class QuizRunner {
    public static void main(String[] args){

        TrueFalse question1 = new TrueFalse("Is Poland in europe?",true);
        Checkbox question2 = new Checkbox("Name the European countries", new String[]{"Belgium", "Bulgaria", "Germany"}, new String[]{"Bangladesh"});
        MultipleChoice question3 = new MultipleChoice("Name capital of Austria","Vienna",new String[]{"Oslo","Bucharest","Bern"} );

        question1.getQuestion();
        question2.getQuestion();
        question3.getQuestion();

        /* Wyświetlić odpowiedzi w losowej kolejności
        Scannerem pobrać odpowiedzi od użytkownika
        Sprawdzic czy jest poprawna
        Wyświetlić wynik całego testu

         */



        /*
        Create a class named QuizRunner with only
        a main method. The program should create several
        questions, present them to the user,
        accept the user’s responses, and then
        tell them whether their answers were correct
        or incorrect.

        Add a short answer question type that includes
        validation behavior to only allow the user
        to enter text with less than 80 characters.
        Add a couple more question types to your program:
        Linear scale: a question that allows
        the user to provide a numeric response within
        an integer scale, which may vary from question
        to question. For instance, it could be 1-3 for
        one linear scale question and 1-5 for another.
        Paragraph: Similar to short answer but allows
        for responses of up to 500 characters.
        Add tests with JUnit to your classes.
         */
    }





}
