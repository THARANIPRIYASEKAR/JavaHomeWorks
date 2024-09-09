package org.example.e188;

import java.util.TreeSet;

public class E188Set {

    public static void main(String[] args) {

        //Initialize a TreeSet<String> to store country names
        TreeSet<String> countryNames = new TreeSet<>();

        //Add Country Names to the TreeSet
        countryNames.add("India");
        countryNames.add("Australia");
        countryNames.add("South Africa");
        countryNames.add("India");
        countryNames.add("America");
        countryNames.add("America");

        //Print the TreeSet
        //A TreeSet removes duplicates and sorts elements in natural ascending order (alphabetically in this case)
        System.out.println(countryNames);

    }

}
