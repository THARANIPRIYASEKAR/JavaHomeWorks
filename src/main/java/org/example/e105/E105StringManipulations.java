package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        //Create Scanner Object
        Scanner scan = new Scanner(System.in);

        //Prompt the user to input 5 names
        System.out.println("In:");

        //Read the input
        String userInput = scan.nextLine();


        //for loop + switch to iterate through the string and print only the vowels
        for (int i = 0; i < userInput.length(); i++) {

            switch(userInput.charAt(i)) {
                case 'a':
                    System.out.print(userInput.charAt(i));
                    break;
                case 'e':
                    System.out.print(userInput.charAt(i));
                    break;
                case 'i':
                    System.out.print(userInput.charAt(i));
                    break;
                case 'o':
                    System.out.print(userInput.charAt(i));
                    break;
                case 'u':
                    System.out.print(userInput.charAt(i));
                    break;
                default:
                    break;
            }
        }

        System.out.println();

    }
}
