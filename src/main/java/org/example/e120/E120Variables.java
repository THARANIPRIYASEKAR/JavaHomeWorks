package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year, batchNumber;
    String schoolName;

    public static void main(String[] args) {

        // Access variables from the main method and assign specific values to them
        E120Variables v = new E120Variables();
        v.year = 2020;
        v.batchNumber = 6;
        v.schoolName = "Syntax";

        // Print values of your variables in the specified format
        System.out.println("I am a student of batch " + v.batchNumber
                + " studying at " + v.schoolName
                + " in the year of " + v.year);
    }

}
