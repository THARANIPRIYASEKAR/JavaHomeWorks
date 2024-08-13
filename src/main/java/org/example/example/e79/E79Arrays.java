package org.example.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };

        // Declare an array to store the sums of each row
        int[] sum = new int[a.length];

        // Use nested loops to iterate through the 2D array and calculate the sum of each row
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                sum[row] = sum[row] + a[row][column];
            }
        }

        // Print the values of the new array
        for (int value : sum) {
            System.out.println(value);
        }
    }
}
