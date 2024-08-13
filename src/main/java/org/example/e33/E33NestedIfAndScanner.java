package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                       // Create a Scanner object to read input;
        int number;
        System.out.println("Please enter a number");                 // Print prompt for user to enter a number
        number= input.nextInt();                                     // Capture the number input
                                                                     // Classify the number
        if(number%2==0) {                                            // Use an if-else statement to check if the number is even or odd
            System.out.println("Value is even");                    // If the number is even,   Print "Value is even"
            if(number>1000) {                                       //    Use another if-else statement to check if the number is greater than 1000
                System.out.println("Even value is large");          //        If it is, print "Even value is large"
            }else {
                System.out.println("Even value is just right");     //        Otherwise, print "Even value is just right"
            }
        }else {                                                     // If the number is odd
            System.out.println("Value is odd");                     //    Print "Value is odd
            if(number>1000) {                                       //    Use another if-else statement to check if the number is greater than 1000
                System.out.println("Odd value is large");           //        If it is, print "Odd value is large"
            }else {
                System.out.println("Odd value is just right");     //        Otherwise, print "Odd value is just right"
            }
        }
        input.close();

    }
}
