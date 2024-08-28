package org.example.e140;

public class E140AccessModifiers {

    public static void main(String[] args) {

        //declare and initialize string array of words
        String[] words ={"Public","Private","this is long","Default"};

        //create object for the class MaxLengthTest
        MaxLengthTest m = new MaxLengthTest();

        //execute the maxLength method with object reference
        System.out.println( m.maxLength(words));

    }
}
