package org.example.e186;

import java.util.HashSet;
import java.util.TreeSet;

public class E186Set {
    public static void main(String[] args) {

        //Initialize a HashSet<String> to store task names for a project
        HashSet<String> task = new HashSet<>();

        //Add Task Names to the HashSet
        task.add("third");
        task.add("first");
        task.add("second");


        //print the HashSet
        //System.out.println(task);

        //sorting to match the expected result
        TreeSet<String> sortedTask = new TreeSet<>(task);
        System.out.println(sortedTask);


        //Remove All Tasks
        task.clear();

        //Print the Result
        System.out.println(task);






    }

}
