package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {

        CheckEvenNumbers en = new CheckEvenNumbers();

        // Call the bothEven method with various arguments to test the method
        System.out.println(en.bothEven(5,8));

    }

}

class CheckEvenNumbers {

    // Create method bothEven with two integer parameters
     boolean bothEven(int a, int b) {

         // Inside the method, check if both numbers are even
         // Return true if both numbers are even, otherwise return false
        if ((a % 2 == 0) && (b % 2 == 0)) {
            return true;
        } else {
            return false;

        }
    }
}