package org.example.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Please enter your monthly rent expense");// Print prompt for user to enter their monthly rent expense
        int rentExpense = userInput.nextInt();// Capture the rent expense input

        System.out.println("Please enter your monthly food expense");// Print prompt for user to enter their monthly food expense
        int foodExpense = userInput.nextInt();// Capture the food expense input

        System.out.println("Please enter your monthly transportation expense");// Print prompt for user to enter their monthly transportation expense
        int transportationExpense = userInput.nextInt();// Capture the transportation expense input

        System.out.println("Please enter your monthly entertainment expense");// Print prompt for user to enter their monthly entertainment expense
        int entertainmentExpense = userInput.nextInt();// Capture the entertainment expense input

        if (rentExpense>foodExpense && transportationExpense>entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else if (rentExpense>foodExpense || transportationExpense>entertainmentExpense) {
            System.out.println("You are on the right track, but could improve.");
        } else if (!(rentExpense>foodExpense && transportationExpense>entertainmentExpense)) {
            System.out.println("You need to rethink your spending priorities.");
        }
        userInput.close();
    }

}
