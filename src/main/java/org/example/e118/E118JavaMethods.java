package org.example.e118;

public class E118JavaMethods {

    //create a method to insert spaces after every character in the inputted string
    public static String spaceOut(String input) {

        String output = "";

        //logic to insert space after every character
        for (int i = 0; i < input.length(); i++) {
            output = output.concat(String.valueOf(input.charAt(i))).concat(" ");
        }
        return output;
    }


    public static void main(String[] args) {

        //execute the method spaceOut
        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));

    }


}
