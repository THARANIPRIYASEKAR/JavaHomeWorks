package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// Create a Scanner object to read input

        System.out.println("Enter the time of day (morning, afternoon, evening, night)");// Print prompt for user to enter the time of day
        String timeOfDay = userInput.nextLine();// Capture the time of day input

        switch(timeOfDay) { // Recommend meal using switch statement
            case "morning":
                System.out.println("Recommended meal: Breakfast");
                break;
            case "afternoon":
                System.out.println("Recommended meal: Lunch");
                break;
            case "evening":
                System.out.println("Recommended meal: Dinner");
                break;
            case "night":
                System.out.println("Recommended meal: Snack");
                break;
            default:
                System.out.println("Invalid time of day entered");
        }
        userInput.close();
    }
}
