package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                     // Create a Scanner object to read input
        boolean isSunny;                                            // Declare a boolean variable isSunny
        System.out.println("Is it sunny outside? (true/false)");    // Print "Is it sunny outside? (true/false)"
        isSunny= input.nextBoolean();                               // Capture the user's input and store it in isSunny
        int temperature;                                            // Declare an integer variable temperature
                                                                    // Use an if-else statement to check if it is sunny
       if(isSunny) {                                                // If it is sunny
           System.out.println("It is a sunny day, I should go somewhere!"); //    Print "It is a sunny day, I should go somewhere!"
           System.out.println("What is the temperature outside?");  //    Print "What is the temperature outside?"
           temperature=input.nextInt();                             //    Capture the user's input and store it in temperature
                                                                    //    Use another if-else statement to check the temperature
        if(temperature>85) {                                       //        If the temperature is higher than 85
            System.out.println("I am going to the beach!");         //            Print "I am going to the beach!"

        }else {                                                     //        Otherwise
            System.out.println("I am going to the park!");          //            Print "I am going to the park!"
        }

       }else {                                                      // If it is not sunny
           System.out.println("I stay home and practice Java");    //    Print "I stay home and practice Java"
       }
       input.close();
    }
}
