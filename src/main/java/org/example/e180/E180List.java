package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args) {

        //Initialize a LinkedList to store employee ages
        LinkedList<Integer> empAges = new LinkedList<>();

        //Add 10 employee ages between 20 and 65
        empAges.add(55);
        empAges.add(19);
        empAges.add(30);
        empAges.add(45);
        empAges.add(40);
        empAges.add(65);
        empAges.add(50);
        empAges.add(75);
        empAges.add(60);
        empAges.add(35);

        //Remove any ages that are not between 25 and 60
        empAges.removeIf(x -> (x < 20) || (x > 60));

        //Sort the filtered ages in ascending order using Collections.sort()
        Collections.sort(empAges);

        //Loop through the sorted LinkedList and calculate the average age of the remaining employees
        int sum = 0;
        double averageAge = 0;
        for (Integer age : empAges) {
            sum += age;
        }
        averageAge = sum / empAges.size();

        // Print the Remaining Ages and the Average
        System.out.println("Remaining ages: " + empAges);
        System.out.println("Average age: " + averageAge);

    }

}
