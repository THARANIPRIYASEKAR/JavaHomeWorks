package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);// Create a Scanner object to read input
        int mealType;
        double mealCost;

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        mealType = userInput.nextInt();// Capture the meal type input

        switch (mealType) {
            case 1:
                mealCost = 5.00;
                break;
            case 2:
                mealCost = 10.00;
                break;
            case 3:
                mealCost = 15.00;
                break;
            default:
                System.out.println("Invalid meal type entered");
                return;
        }

        System.out.println("The price of your meal is $" + mealCost);
        userInput.close();
    }
}
