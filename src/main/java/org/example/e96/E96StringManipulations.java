package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner userInput = new Scanner(System.in);

        // Prompt the user to input a programming language
        System.out.println("Please enter a programming language:");

        // Read the input string
        String language = userInput.next();

        // Use conditional statements to print the description based on the input
        // If the input is "Java", print "Java is a programming language"
        // If the input is "C", print "C is a procedural programming language"
        // If the input is "C++", print "C++ is a middle-level programming language"
        // For any other input, print "Doesn't match any programming language"

        switch (language) {
            case "Java":
                System.out.println("Java is a programming language");
                break;
            case "C":
                System.out.println("C is a procedural programming language");
                break;
            case "C++":
                System.out.println("C++ is a middle-level programming language");
                break;
            default:
                System.out.println("Doesn't match any programming language");

        }
    }
}
