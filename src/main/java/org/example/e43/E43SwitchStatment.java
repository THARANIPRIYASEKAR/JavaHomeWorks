package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Create a Scanner object to read input
        int usage, tier;
        System.out.println("Enter your electricity usage in kWh"); // Print prompt for user to enter their electricity usage in kWh
        usage = userInput.nextInt(); // Capture the usage input
        double bill;

        //categorize the usage
        if (usage >= 0 && usage <= 100) {
            tier = 1;
        } else if (usage >= 101 && usage <= 200) {
            tier = 2;
        } else if (usage >= 201 && usage <= 300) {
            tier = 3;
        } else if (usage >= 301) {
            tier = 4;
        } else {
            tier = 0;
        }

        // Calculate bill using switch statement
        switch (tier) {
            case 1:
                bill = usage * 0.12;
                break;
            case 2:
                bill = usage * 0.15;
                break;
            case 3:
                bill = usage * 0.20;
                break;
            case 4:
                bill = usage * 0.25;
                break;
            default:
                System.out.println("Invalid usage entered");
                return;
        }
        System.out.println("Your electricity bill is $" + bill);
        userInput.close();

    }
}
