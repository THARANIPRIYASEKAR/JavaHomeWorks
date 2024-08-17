package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner scan = new Scanner(System.in);

        //Prompt for User input
        System.out.println("In:");

        //Read the user input
        String userInput = scan.next();

        //For loop to print every other letter
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }

    }
}
