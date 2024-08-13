package org.example.e55;

import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner userInput = new Scanner(System.in);

        // Declare a variable for user input
        int favouriteNumber;

        // Use a do-while loop to collect user input until they enter the number 7
        do {

            // Print "Enter your favorite number:"
            System.out.println("Enter your favorite number:");

            // Capture the user's input and store it in the variable
            favouriteNumber = userInput.nextInt();

            // Print "You entered: " followed by the value of the variable
            System.out.println("You entered: " + favouriteNumber);

        } while (favouriteNumber !=7);

        // Print "You've entered 7! Loop ends."
        System.out.println("You've entered 7! Loop ends.");
        userInput.close();
    }
}
