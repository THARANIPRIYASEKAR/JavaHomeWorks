package org.example.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense = 20.10;
        double afternoonExpense = 26.02;
        double eveningExpense = 30.13 ;
        double totalExpense;
        // Calculate total expense
        totalExpense = morningExpense + afternoonExpense + eveningExpense;
        // Define a budget
        double budget=100.0;

        // Check if within budget
        if(totalExpense<=budget) {
            System.out.println("Your total daily expense is: " + totalExpense);
            System.out.println("You are within the budget.");
        }else {
            System.out.println("You are over the budget.");
        }

    }
}
