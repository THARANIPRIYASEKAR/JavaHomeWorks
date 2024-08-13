package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// Create a Scanner object to read input

        System.out.println("Enter name of the instructor"); // Print prompt for user to enter the name of the instructor
        String instructorName = userInput.nextLine(); // Capture the instructor name input
        String responsibility;
        switch (instructorName) { // Determine the responsibility based on the instructor's name using a switch statement
            case "Asghar":
               responsibility= "Will take care of Java Assignment";
                break;
            case "Moazzam":
                responsibility = "Will take care of SDLC Assignment";
                break;
            case "Weqas":
                responsibility = "Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                break;
            default:
                responsibility = "Invalid instructor selected";
        }
        System.out.println(responsibility); // Print the responsibility
        userInput.close();
    }
}
