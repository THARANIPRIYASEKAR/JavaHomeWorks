package org.example.e140;

public class E140AccessModifiers {


    //create method maxLength as package-private
    String maxLength(String[] words) {

        //declare variable local variable to store the word with max length
        String mLength = "";

        //for loop to iterate through the string array
        for (int i = 0; i < words.length; i++) {

            //if condition to check the max length
            if (words[i].length() > mLength.length()) {

                //mLength will be replaced with word[i] whenever the condition met
                mLength = words[i];

            }
        }

        //return the word with max length
        return mLength;


    }

}
