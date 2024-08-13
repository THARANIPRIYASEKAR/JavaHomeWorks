package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Create a Scanner object to read input
        int coffeeType;
        double coffeeCost;
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)"); // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        coffeeType = userInput.nextInt(); // Capture the coffee type input

        switch (coffeeType) { // Print the price
            case 1:
                coffeeCost =  3.00;
                break;
            case 2:
                coffeeCost = 4.00;
                break;
            case 3:
                coffeeCost = 4.50;
                break;
            case 4:
                coffeeCost = 5.00;
                break;
            default:
                System.out.println("Invalid coffee type entered");
                return;
        }

        System.out.println("The price of your coffee is $" + coffeeCost); // Output: The price of your coffee is $____
        userInput.close();
    }
}
