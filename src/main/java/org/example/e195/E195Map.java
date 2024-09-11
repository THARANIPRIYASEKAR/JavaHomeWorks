package org.example.e195;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E195Map {

    public static void main(String[] args) {

        //Initialize a Map<String, List<String>> to store the subject (key) and the list of students (value)
        Map<String, List<String>> studentsBySubjects = new LinkedHashMap<>();

        //Add data
        studentsBySubjects.put("Mathematics", List.of("Alice", "Bob"));
        studentsBySubjects.put("Science", List.of("Charlie", "David"));
        studentsBySubjects.put("History", List.of("Eve", "Frank"));

        System.out.println("From Map (Students by Subject):");
        studentsBySubjects.forEach((k, v) -> {
            System.out.print("Subject: " + k + " ");
            System.out.print("Students: " + v);
            System.out.println();
        });

    }
}
