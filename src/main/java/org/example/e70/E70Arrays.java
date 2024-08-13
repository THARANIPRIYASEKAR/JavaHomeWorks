package org.example.e70;

public class E70Arrays {
    public static void main(String[] args) {
        // Create an array of integers with size 11
        int[] arrayOfYears = new int[11];
        // arrayOfYears[0] = 2010;
        // Use a for loop to add the years from 2010 to 2020 to the array
        for (int i = 0; i < arrayOfYears.length; i++) {
            if (i == 0) {
                arrayOfYears[i] = 2010;
            } else {
                arrayOfYears[i] = arrayOfYears[i - 1] + 1;
            }
        }

        // Use another for loop to iterate through the array and print each value on a new line
        for (int years : arrayOfYears) {
            System.out.println(years);
        }

    }
}
