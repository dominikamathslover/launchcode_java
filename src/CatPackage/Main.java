package CatPackage;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield",12);
        garfield.eat();
        System.out.println(garfield.isTired());


    }
}