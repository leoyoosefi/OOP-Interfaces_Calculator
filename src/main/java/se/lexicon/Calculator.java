package se.lexicon;

import java.util.Scanner;

public interface Calculator {

    //statics
    Scanner SC = new Scanner(System.in);

    static String takeInput(){
        return SC.nextLine();
    }




    //abstracts
    int addition(int number1, int number2);
    int subtraction(int number1, int number2);
    int multiplication(int number1, int number2);
    int division(int number1, int number2);

    default void welcomeMenu(){
        System.out.println("****welcome to my calculator****");
    }
}
