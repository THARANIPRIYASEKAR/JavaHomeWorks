package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {

        //Initialize a HashMap<Integer, String> to store student records
        HashMap<Integer, String> studentRecords = new HashMap<>();

        //Add Student Records to the HashMap
        studentRecords.put(101, "John");
        studentRecords.put(102, "Emily");
        studentRecords.put(103, "Michael");
        studentRecords.put(104, "Sarah");
        studentRecords.put(105, "David");

        //Retrieve and Print Keys (Student IDs) Using a Loop and keySet()
        System.out.println("Student IDs:");
        for (Integer k : studentRecords.keySet()) {
            System.out.println("Student ID: " + k);
        }
        System.out.println();

        //Retrieve and Print Values (Student Names) Using a Loop and values()
        System.out.println("Student Names:");
        for (String v : studentRecords.values()) {
            System.out.println("Student Name: " + v);
        }
        System.out.println();

        //Retrieve and Print Both Keys and Values Using a Loop and entrySet()
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }


    }

}
