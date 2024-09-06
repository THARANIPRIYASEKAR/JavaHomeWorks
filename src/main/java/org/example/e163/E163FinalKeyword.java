package org.example.e163;

public class E163FinalKeyword {

    public static void main(String[] args) {

        //local Variable
        int[] numArray = {3, 4, 5, 6, 6};

        //Creates an object of the StringManipulator class
        StringManipulator sm = new StringManipulator("hello");

        // calls the reverseString method
        System.out.println(sm.reverseString());

        //Creates an object of the ArrayManipulator class
        ArrayManipulator am = new ArrayManipulator();

        // calls the reverseString method
        System.out.println(am.avgElements(numArray));

    }

}
