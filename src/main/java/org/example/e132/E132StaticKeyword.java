package org.example.e132;

public class E132StaticKeyword {

    //static method to subtract each element in 2d array by 10
    static double[][] reduce10(double[][] inArray) {

        double[][] newArray = new double[inArray.length][];

        //iterate through the array and reduce the values by 10
        for (int i = 0; i < inArray.length; i++) {
            newArray[i] = new double[inArray[i].length];
            for (int j = 0; j < inArray[i].length; j++) {
                newArray[i][j] = inArray[i][j] - 10;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        //declaring and initializing double array nums
        double[][] nums = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

        //calling the method reduce10
        nums = reduce10(nums);

        //print the values from the array
        for (double[] i : nums) {
            for (double j : i) {
                System.out.print((int) j + " ");
            }
            System.out.println();
        }
    }
}

