package org.example.e128;

public class E128StaticKeyword {

    //creating static method to return a combined string of s1 and s2 in specified format
        static String mixString(String s1, String s2) {

        String mString = "";

        //logic to combine two strings
        if (s1.length() == s2.length()) {
            int len = s1.length();
            for (int i = 0; i < len; i++) {
                mString = mString.concat(String.valueOf(s1.charAt(i))).concat(String.valueOf(s2.charAt(i)));
            }
        }
        return mString;
    }

    public static void main(String[] args) {

        //print the results by calling mixString method
        System.out.println(mixString("12345", "abcde"));

    }

}