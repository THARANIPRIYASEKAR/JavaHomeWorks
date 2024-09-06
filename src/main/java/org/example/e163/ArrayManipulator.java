package org.example.e163;

public class ArrayManipulator {

    //creates final method avgElements - accepts int array
    public final double avgElements(int[] numArray) {

        //declare and initialize local variables to calculate avg of numArray elements
        double average = 0, sum = 0;

        //loop through array and find the sum
        for (int a : numArray) {
            sum = sum + a;
        }

        //calculate and return average
        average = sum / numArray.length;
        return average;
    }

}
