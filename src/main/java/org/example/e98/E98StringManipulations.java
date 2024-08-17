package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "Hello Syntax friends" to it
        String given = "Hello Syntax friends";
        String manipulated = "Welcome";

        // Manipulate the string to create a new string "Welcome Syntax family"
        manipulated = manipulated.concat(given.substring(given.indexOf(" "), given.length()));
        manipulated = manipulated.replace("friends", "family");

        // Print the new string
        System.out.println(manipulated);


    }
}
