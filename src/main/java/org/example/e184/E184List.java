package org.example.e184;

import java.util.ArrayList;
import java.util.List;

public class E184List {

    //Create a method removeCountriesStartingWithA that takes a List<String> as a parameter
    //Remove all elements from the list that start with the letter 'A'.
    public static List<String> removeCountriesStartingWithA(List<String> countries) {

        countries.removeIf(x -> x.charAt(0)=='A');
        return countries;
    }

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Argentina");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");

        //Print the updated list
        System.out.println(removeCountriesStartingWithA(countries));

    }
}
