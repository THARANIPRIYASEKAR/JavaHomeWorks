package org.example.e181;

import java.util.ArrayList;
import java.util.Iterator;

public class E181List {
    public static void main(String[] args){

        //Initialize an ArrayList<Boolean> called listA to store the status of tasks
        ArrayList<Boolean> listA = new ArrayList<>();

        //Add Task Statuses- true for completed/false for not completed
        listA.add(true);
        listA.add(false);
        listA.add(false);

        //Create another ArrayList<Boolean> called listB
        ArrayList<Boolean> listB = new ArrayList<>();

        // copy all values from listA into listB
        listB.addAll(listA);

        //Use an Iterator to loop through listB and print the task statuses
        Iterator<Boolean> iterator = listB.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        }
    }
