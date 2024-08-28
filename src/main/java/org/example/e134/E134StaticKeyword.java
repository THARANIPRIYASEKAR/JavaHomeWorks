package org.example.e134;

public class E134StaticKeyword {
    public static void main(String[] args) {

        //calling countVowels method and print the result
        System.out.println(Vowels.countVowels("obama"));
        System.out.println(Vowels.countVowels("happy friday! i love weekends"));

    }
}

class Vowels {

    //declaring method countVowels as static
    //inside logic to count the number of vowels in the string s and return the count
     static int countVowels(String s) {

        //declare and initialize the count as zero
        int count = 0;

        //for loop to iterate the string
        for (int i = 0; i < s.length(); i++) {

            //switch case to check for vowel occurrence
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    // increase the count if the char is a vowel
                    count++;
            }
        }
        return count;
    }
}


