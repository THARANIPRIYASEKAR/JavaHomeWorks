package org.example.e141;

public class MaxValueTest {

    //create method maxValue with visibility to every class in any package
    public static int maxValue(int[] mNum) {

        //declare and initialize local variable to store max value in the array
        int max = mNum[0];

        //for loop to iterate through the array
        for (int i = 1; i < mNum.length; i++) {

            //if condition to find max value
            if (mNum[i] > max) {

                //value of max will be replaced with mNum[i] whenever the condition met
                max = mNum[i];
            }
        }

        //return result
        return max;
    }
}
