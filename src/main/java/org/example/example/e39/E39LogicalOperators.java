package org.example.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        char grade;
        int marks;
        Scanner userInput = new Scanner(System.in);// Create a Scanner object to read input
        System.out.println("Please enter your mark");// Print prompt for user to enter their mark
        marks = userInput.nextInt();// Capture the mark input

        if (marks > 0 && marks <= 100) { // Determine the grade based on the mark
            if (marks > 80) {
                grade = 'A';
            } else if (marks > 60 && marks <= 80) {
                grade = 'B';
            } else if (marks > 50 && marks <= 60) {
                grade = 'C';
            } else if (marks > 45 && marks <= 50) {
                grade = 'D';
            } else if (marks > 25 && marks <= 45) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Your grade is " + grade);
        } else {
            System.out.println("Please enter valid mark");

        }
        userInput.close();
    }
}
