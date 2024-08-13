package org.example.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner userInput = new Scanner(System.in);

        // Create an array of integers with a size of 5
        int[] arrayOfIntegers = new int[5];

        // Use a loop to read 5 integers from the user and store them in the array
        // (Do not print any prompt message for the user)
        for (int i = 0; i < 5; i++) {
            arrayOfIntegers[i] = userInput.nextInt();
        }

        // Use another loop to multiply each element of the array by 10 and print the result
        for (int j = 0; j < 5; j++) {
            System.out.println(arrayOfIntegers[j] * 10);
        }

    }
}
