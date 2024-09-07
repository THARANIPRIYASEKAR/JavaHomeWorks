package org.example.e173;


import java.util.ArrayList;

public class E173List {
    public static void main(String[] args){

        //Initialize an ArrayList<String> to store tasks
        ArrayList<String> toDoList = new ArrayList<>();

        //Check if Empty
        System.out.println(toDoList.isEmpty());

        //Add a Task
        toDoList.add("Buy Groceries");

        //Check if Empty Again
        System.out.println(toDoList.isEmpty());
    }

}
