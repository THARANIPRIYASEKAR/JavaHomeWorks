package org.example.e179;

import java.util.LinkedList;

public class E179List {
    public static void main(String[] args) {

        //Initialize a LinkedList to store integers
        LinkedList<Integer> numList = new LinkedList<>();

        //Add Elements to LinkedList from 50 to 100
        for (int i = 50; i <= 100; i++) {
            numList.add(i);
        }

//      Remove Elements which are Not Divisible by 3 using for loop
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 3 != 0) {
                numList.remove(i);
                i--;
            }
        }

//      Remove Elements which are Not Divisible by 3 using lambda expression
//      numList.removeIf(x ->(x)%3 !=0);

//      Use an iterator to remove elements not divisible by 3
//      Iterator<Integer> iterator = numList.iterator();
//      while (iterator.hasNext()) {
//          int number = iterator.next();
//          if (number % 3 != 0) {
//              iterator.remove();
//          }
//      }

        // Print the remaining elements
        System.out.println(numList);
    }


}