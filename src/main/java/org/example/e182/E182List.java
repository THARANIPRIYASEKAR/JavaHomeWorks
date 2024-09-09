package org.example.e182;


import java.util.LinkedList;

public class E182List {

    //Initialize a LinkedList<Integer> to store prime numbers
    LinkedList<Integer> primeNumbers = new LinkedList<>();

    //Create a Method to Check Prime Numbers
    public boolean isPrime(int num) {

        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        if (num == 2) return true;  // 2 is the only even prime number
        if (num % 2 == 0) return false; // Other even numbers are not prime
        for (int i = 3; i <= Math.sqrt(num); i += 2) { // Check odd divisors up to sqrt(num)
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        E182List l = new E182List();
        //Use a loop to check each number from 1 to 100
        //If the number is prime, add it to the LinkedList

        for (int j = 1; j <= 100; j++) {
            if (l.isPrime(j)) {
                l.primeNumbers.add(j);
            }
        }

        //Print the LinkedList of Prime Numbers
        System.out.println(l.primeNumbers);
    }

}
