package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {

        //Create Scanner Object
        Scanner scan = new Scanner(System.in);

        // Create an array of String elements with a size of 5
        String[] names = new String[5];

        //Prompt the user to input 5 names
        System.out.println("In:");

        //for loop to capture names from user
        for(int i=0;i<5;i++){
            names[i] = scan.next();
        }

        //for each loop to iterate through the array and print the first three characters of each name, one per line
        for(String str: names) {
            System.out.println(str.substring(0,3));
        }

    }
}


