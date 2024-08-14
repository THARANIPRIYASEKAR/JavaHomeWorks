package codingTask1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        /* Write a java program to check whether a given number is prime or not */
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Please enter a number");
        int primeOrNot = inputValue.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < primeOrNot; i++) {
            if (primeOrNot % i != 0) {
                continue;
            } else {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.println("It is a PRIME number");
        } else {
            System.out.println("It is not a PRIME number");
        }

    }
}
