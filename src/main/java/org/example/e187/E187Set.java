package org.example.e187;

import java.util.HashSet;

public class E187Set {

    public static void main(String[] args) {

        //Initialize a HashSet<String> to store color names
        HashSet<String> colors = new HashSet<>();

        // Add Color Names to the HashSet
        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");

        //Print the Color Collection
        System.out.println("Original Hash Set: " + colors);

        // Print the Size of the HashSet
        System.out.println("Size of the Hash Set: " + colors.size());


    }

}
