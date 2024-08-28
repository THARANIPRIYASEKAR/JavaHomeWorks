package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {

       StringConversion sc = new StringConversion();

       // Call the convertToUpper method and print the result
        System.out.println(sc.convertToUpper("test"));
    }
}


class StringConversion {

    // Create method convertToUpper with a string parameter
    String convertToUpper (String s) {

        // Inside the method, convert the string to uppercase using toUpperCase method
        // Return the new uppercase string
        return(s.toUpperCase());
    }

}