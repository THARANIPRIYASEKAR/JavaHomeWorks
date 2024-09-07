package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args) {

        //Initialize an ArrayList to store chat messages entered by the user
        ArrayList<String> chatMessages = new ArrayList<>();

        //Use the Scanner class to input 5 chat messages from the user
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            chatMessages.add(i, scan.nextLine());
        }

        //Remove Specific Message -> 1st, 3rd, and 5th elements
        //Using for loop
        for (int j = chatMessages.size(); j > 0; j -= 2) {
            chatMessages.remove(j - 1);
        }

        System.out.println("Remaining messages:");
        System.out.println(String.join(" ", chatMessages));

        //Another Method by comparing the messages

//        chatMessages.removeIf(x -> x.equals("Hi"));
//        chatMessages.removeIf(x -> x.equals("Great to see you!"));
//        chatMessages.removeIf(x -> x.equals("Goodbye!"));
//        System.out.println("Remaining messages:");
//        System.out.println(String.join(" ", chatMessages));

        scan.close();
    }

}
