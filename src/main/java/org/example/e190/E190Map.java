package org.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {

        //Initialize a LinkedHashMap<String, String> to store address details
        LinkedHashMap<String, String> addresses = new LinkedHashMap<>();

        //Add the address components as key-value pairs to the LinkedHashMap
        addresses.put("Street", "Patrick ST");
        addresses.put("Suite", "265");
        addresses.put("City", "Vienna");
        addresses.put("Zip", "22180");
        addresses.put("Country", "United States");

        //Print All Address Values from the LinkedHashMap
        System.out.println("Address Details:");
        addresses.forEach((k, v) -> System.out.println(v));


    }
}
