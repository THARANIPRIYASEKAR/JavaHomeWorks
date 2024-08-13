package org.example.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;

        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows
        for (int row = 0; row < a.length; row += 2) {
            for (int column = 0; column < a[row].length; column += 2) {
                sum += a[row][column];
            }
        }

        // Print the calculated sum
        System.out.println(sum);
    }
}
