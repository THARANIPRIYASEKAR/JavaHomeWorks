package org.example.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// Create a Scanner object to read input

        System.out.println("Are you thirsty? (true/false)");// Print prompt for user to answer if they are thirsty
        boolean isThirsty = userInput.nextBoolean();// Capture the thirsty input

        System.out.println("Are you sleepy? (true/false)");// Print prompt for user to answer if they are sleepy
        boolean isSleepy = userInput.nextBoolean();// Capture the sleepy input

        String drink; // Determine the drink based on the inputs

        if(isThirsty && !isSleepy) {
            drink = "water";
        }else if(isThirsty && isSleepy) {
            drink = "coffee";
        }else if(!isThirsty && isSleepy) {
            drink = "tea";
        }else {
            drink = "nothing";
        }

        System.out.println("Looks like you need to drink " + drink);// Print the drink suggestion
        // Output: Looks like you need to drink ___
        userInput.close();
    }
}
