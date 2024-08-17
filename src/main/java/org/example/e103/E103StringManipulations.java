package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner scan = new Scanner(System.in);

        //Prompt for User input
        System.out.println("In:");

        //Read the user input
        String userInput = scan.next();

        //For loop to print every other letter
        for (int i = 0; i < userInput.length(); i++) {
            if(i<=userInput.length()-2) {
                System.out.print(userInput.charAt(i) + " ");
            }
            else {
                System.out.println(userInput.charAt(i));
            }
        }

    }
}
