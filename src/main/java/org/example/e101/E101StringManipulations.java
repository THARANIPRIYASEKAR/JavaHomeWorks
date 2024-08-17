package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {

        //Create a Scanner object
        Scanner scan = new Scanner(System.in);

        //Prompt for User input
        System.out.println("In: ");

        //Read the user input
        String userInput = scan.nextLine();

        //For loop to print every other letter
        for(int i=0; i<userInput.length();i+=2) {
            System.out.print(userInput.charAt(i));
        }
        System.out.println();
    }
}
