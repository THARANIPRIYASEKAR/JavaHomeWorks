package org.example.e139;

public class AlphabeticalTest {

    //create the method alphabetical with visibility to all classes in the project
    public static String alphabetical(String str) {

        //declare and initialize local variable to store the formated string
        String alphabet = "";

        //for loop to iterate through every character of the string
        for (int i = 0, j = 1; i < str.length(); i += 2, j += 2) {

            /*if condition to compare characters of the string,
            where characters later on in the alphabet are "greater"*/
            if (j < str.length()) {

                if (str.charAt(j) > str.charAt(i)) {
                    alphabet = alphabet.concat(String.valueOf(str.charAt(j)));
                } else {
                    alphabet = alphabet.concat(String.valueOf(str.charAt(i)));
                }
            } else {
                alphabet = alphabet.concat(String.valueOf(str.charAt(i)));
            }

        }
        //return result
        return alphabet;
    }

}
