package Quizz;

import Quizz.core.*;

import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        System.out.println( Arrays.toString(new String[]{"30", "40", "50"}));

        Question question1 = new TrueFalse("Is Poland in Europe?", true);
        Question question2 = new Checkbox("Name the European countries", new Answer[]{new Answer("Belgium", true), new Answer("Bulgaria", true), new Answer("Bangladesh", false), new Answer("Germany", true)});
        Question question3 = new MultipleChoice("Name capital of Austria", new Answer[]{new Answer("Vienna", true), new Answer("Oslo", false), new Answer("Bucharest", false), new Answer("Bern", false)});
        Question question4 = new IntAnswerQuestion("How many countries are there in EU?", 27);
        Question question5 = new ArrayAnswerQuestion("Cheops pyramid dimensions", new String[]{"30", "40", "50"});

        Quiz quiz = new Quiz(new Question[]{question1, question2, question3, question4, question5});
        Scanner scanner = new Scanner(System.in);


        for (Question question : quiz.getQuestions()) {
            System.out.println(question.getQuestion());

            if (question instanceof OptionQuestion) {
                for (Answer answer : ((OptionQuestion)question).getAnswers()) {
                    System.out.println(answer.getLabel());
                }
            }
            System.out.println(question.checkUserAnswer(scanner.nextLine()));
        }




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
        to question.
        For instance, it could be 1-3 for
        one linear scale question and 1-5 for another.
        Paragraph: Similar to short answer but allows
        for responses of up to 500 characters.
        Add tests with JUnit to your classes.


         if (shuffle) {
            List<Answer> list = Arrays.stream(answers).toList();
            Collections.shuffle(list);
            return (Answer[])list.toArray();
        } else
         */


    }


}
