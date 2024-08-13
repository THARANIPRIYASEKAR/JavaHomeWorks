package org.example.example.e42;

import java.util.Scanner;

public class E42SwitchClass {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Create a Scanner object to read input

        System.out.println("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)"); // Print prompt for user to enter the day of the week
        int dayOfWeek = userInput.nextInt(); // Capture the day of the week input

        switch (dayOfWeek) {  // Suggest activity using switch statement
            case 1:
                System.out.println("Activity: Go to the gym");
                break;
            case 2:
                System.out.println("Activity: Attend a coding meetup");
                break;
            case 3:
                System.out.println("Activity: Go for a mid-week run");
                break;
            case 4:
                System.out.println("Activity: Take a cooking class");
                break;
            case 5:
                System.out.println("Activity: Movie night");
                break;
            case 6:
                System.out.println("Activity: Family day");
                break;
            case 7:
                System.out.println("Activity: Relax and recharge");
                break;
            default:
                System.out.println("Invalid day entered");

        }
        userInput.close();
    }
}
