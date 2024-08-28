package org.example.e131;

public class E131StaticKeyword {


    //static method to return every 3rd letter of the String s
    static String thirdLetter(String s) {
        String tL = "";

        //fetch every third letter of the string
        for (int i = 0; i < s.length(); i += 3) {
            tL = tL.concat(String.valueOf(s.charAt(i)));
        }

        return tL;
    }

    public static void main(String[] args) {

        //calling method thirdLetter and print the result
        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));
    }
}
