package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                  // Create a Scanner object to read input
        int num1, num2, num3;
        System.out.println("Please enter 3 distinct numbers separated by spaces");// Print prompt for user to enter 3 distinct numbers separated by spaces
        num1 = input.nextInt();                                                   // Capture the three numbers input
        num2 = input.nextInt();
        num3 = input.nextInt();
        // Use nested if-else statements to find the largest number
        if (num1 > num2) {                                                         // If num1 is greater than or equal to num2
            if (num1 > num3) {                                                     //    If num1 is greater than or equal to num3
                System.out.println("The largest number is " + num1);             //        num1 is the largest
            } else {
                System.out.println("The largest number is " + num3);             //        num3 is the largest
            }                                                                    // Else
        } else if (num2 > num3) {                                                    //    If num2 is greater than or equal to num3
            System.out.println("The largest number is " + num2);                 //        num2 is the largest
        } else {                                                                  //        num3 is the largest
            System.out.println("The largest number is " + num3);                 // Print the largest number

        }
        input.close();
    }
}
