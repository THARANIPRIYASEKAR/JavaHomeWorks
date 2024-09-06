package org.example.e163;

public class StringManipulator {

    //declaring instance variable
    private String str;

    //initializing instance variable through constructor
    public StringManipulator(String str) {
        this.str = str;
    }

    //creates final method reverseString - no arguments
    public final String reverseString() {

        //type casting into string builder, applying reverse method
        StringBuilder sb = new StringBuilder(str);

        //type casting back into string and return the result
        return sb.reverse().toString();
    }

}
