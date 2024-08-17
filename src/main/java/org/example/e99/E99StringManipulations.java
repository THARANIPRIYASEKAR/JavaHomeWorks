package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanInput = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String userInput = scanInput.nextLine();

        // Remove all spaces and convert the string to lowercase
        userInput = userInput.replaceAll("[\\s]", "");
        userInput = userInput.toLowerCase();

        //typecasting to StringBuilder to use reverse function
        StringBuilder sb = new StringBuilder(userInput);

        // Check if the string is a palindrome
        boolean isPalindrome = userInput.contentEquals(sb.reverse());

        // Print "true" if the string is a palindrome, and "false" otherwise
        System.out.println(isPalindrome);


    }
}
