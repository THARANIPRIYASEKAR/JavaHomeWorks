package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {

        //Create scanner object
        Scanner scanInput = new Scanner(System.in);

        //Prompt the user for input
        System.out.println("In: ");

        //Read the user input
        String userInput = scanInput.nextLine();

        //For loop to reverse a string
        for (int i = userInput.length(); i > 0; i--) {
            System.out.print(userInput.charAt(i - 1));
        }
        System.out.println();
    }
}
