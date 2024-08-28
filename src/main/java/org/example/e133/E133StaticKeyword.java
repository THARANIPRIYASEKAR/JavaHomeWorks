package org.example.e133;

public class E133StaticKeyword {

    //creating static method to count the number of occurrences of 'a' or 'A' within s
    static int countA(String s) {

        //declare and initialize local variable count to zero
        int count = 0;

        //for to iterate through the every character in the string
        for (int i = 0; i < s.length(); i++) {

            //if logic to check if the char is 'a' || 'A'
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {

                //increment the counter if condition met
                count++;
            }
        }
        //return the count
        return count;
    }

    public static void main(String[] args) {

        //calling countA method and print the result
        System.out.println(countA("aaa"));
        System.out.println(countA("aaBBdf8k3AAadnklA"));
    }
}

