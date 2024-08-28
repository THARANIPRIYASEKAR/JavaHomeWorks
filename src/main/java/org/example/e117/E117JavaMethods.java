package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {

        // Call the sumEvenToX method with various arguments to test the method
        System.out.println(sumEvenToX(5));
        System.out.println(sumEvenToX(8));

    }

    // Creating a Method to Sum Even Integers
    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            sum += i;
        }
        return sum;
    }

}
