package org.example.e140;

public class MaxLengthTest {

    public static void main(String[] args) {

        //declare and initialize string array of words
        String[] s1 ={"this", "is", "a", "long", "word"};
        String[] s2 = {"java", "programming", "is", "fun"};

        //create object for the class MaxLengthTest
        E140AccessModifiers e = new E140AccessModifiers();

        //execute the maxLength method with object reference
        System.out.println( e.maxLength(s1));
        System.out.println( e.maxLength(s2));

    }
}
