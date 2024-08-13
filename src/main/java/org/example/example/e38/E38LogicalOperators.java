package org.example.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// Create a Scanner object to read input
        String subject;
        System.out.println("Is it weekend? (true/false)");// Print prompt for user to answer if it is the weekend
        boolean isWeekend = userInput.nextBoolean();// Capture the weekend input
        System.out.println("Are you available? (true/false)");
        boolean isAvailable = userInput.nextBoolean();// Determine the subject based on the input
        if (isWeekend && isAvailable) {
            subject = "Java"; // If it is the weekend
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else {
            subject = "no subject";
        }
        System.out.println("Today you will be learning " + subject);
        userInput.close();
    }
}
