package org.example.e197;


import java.util.HashMap;
import java.util.Map;

public class E197Map {

    public static void main(String[] args) {

        //Initialize a Map<Integer, Dog> to store dogs with their IDs
        Map<Integer, Dog> dogMap = new HashMap<>();

        //Create Dog objects and add them to the map
        //Add each dog to the map using a unique ID
        dogMap.put(1, new Dog("Max", "Labrador", 5));
        dogMap.put(2, new Dog("Bella", "Beagle", 3));
        dogMap.put(3, new Dog("Rocky", "Bulldog", 4));

        //Retrieve and Print Dog Information

        for (Map.Entry<Integer, Dog> entry : dogMap.entrySet()) {
            System.out.println("Dog ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }

    }
}

