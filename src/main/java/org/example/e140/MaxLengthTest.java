package org.example.e140;

public class MaxLengthTest {

    //create method maxLength with visibility only within the package
    protected String maxLength(String[] mWords) {

        //declare variable local variable to store the word with max length
        String mLength = "";

        //for loop to iterate through the string array
        for (int i = 0; i < mWords.length; i++) {

            //if condition to check the max length
            if (mWords[i].length() > mLength.length()) {

                //mLength will be replaced with mword[i] whenever the condition met
                mLength = mWords[i];

            }
        }
        //return the word with max length
        return mLength;
    }
}
