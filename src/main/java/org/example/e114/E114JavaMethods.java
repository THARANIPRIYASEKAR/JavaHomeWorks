package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {

        ArithmeticOperations a = new ArithmeticOperations();

        // Call the add method with arguments that add up to 30
        a.add(20, 10);

        // Call the multiply method with arguments that multiply to 30
        a.multiply(15, 2);

        // Call the subtract method with arguments that subtract to 20
        a.subtract(30, 10);
    }

   }

class ArithmeticOperations {

    //Create a method named multiply that accepts two integer parameters and performs multiplication.
    public void multiply(int a, int b) {

        //print the result of multiplying the two parameters
        System.out.println("Multiplication " + a * b);
    }

    //Create a method named add that accepts two integer parameters and performs addition
    public void add(int a, int b) {

       //print the result of adding the two parameter
         System.out.println("Addition " + (a + b));
    }

    //Create a method named subtract that accepts two integer parameters and performs subtraction.
    public void subtract(int a, int b) {

        //print the result of subtracting the second parameter from the first.
        System.out.println("Subtraction " + (a - b));
    }
}