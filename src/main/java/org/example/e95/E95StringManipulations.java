package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner userInput = new Scanner(System.in);

        // Prompt the user to input a string value
        System.out.print("Please enter a word: ");

        // Read the input string
        String str = userInput.next();

        // Extract the first 3 letters using the substring() method
        String first3 = str.substring(0,3);

        // Print the result in the specified format
        System.out.print("The first 3 letters of " + str + " is " + first3);
        System.out.println();
    }
}
