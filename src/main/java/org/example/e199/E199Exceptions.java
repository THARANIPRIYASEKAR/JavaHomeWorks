package org.example.e199;

public class E199Exceptions {

    public static void main(String[] args) {

        //Create an array of integers with 5 elements
        int[] numArray ={1,2,3,4,5};
        try{
            System.out.println("Trying to access an element...");
            System.out.println(numArray[5]);
        }
        catch (ArrayIndexOutOfBoundsException ob) {
            System.out.println("Error: Array index is out of bounds");
        }

        System.out.println("Program has finished");

    }

}
