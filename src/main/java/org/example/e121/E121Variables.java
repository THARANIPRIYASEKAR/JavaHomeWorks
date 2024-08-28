package org.example.e121;

public class E121Variables {

    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        // Create 2 instances of the class
        E121Variables v1 = new E121Variables();
        E121Variables v2 = new E121Variables();

        // Assign values to variables for the first instance
        v1.intValue=10;
        v1.doubleValue=10.23;
        v1.charValue='a';

        // Print values of the first instance
        System.out.println(v1.intValue + "\n" + v1.doubleValue + "\n" + v1.charValue);

        // Assign values to variables for the second instance
        v2.intValue=100;
        v2.doubleValue=100.23;
        v2.charValue='s';

        // Print values of the second instance
        System.out.println(v2.intValue + "\n" + v2.doubleValue + "\n" + v2.charValue);
    }

}
