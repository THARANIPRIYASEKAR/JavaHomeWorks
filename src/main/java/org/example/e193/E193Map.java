package org.example.e193;

import java.util.HashMap;

public class E193Map {

    public static void main(String[] args) {

        //Initialize a HashMap<Integer, String> to store a library catalog
        HashMap<Integer, String> libraryCatalog = new HashMap<>();

        //Add books to the HashMap
        libraryCatalog.put(101, "The Catcher in the Rye");
        libraryCatalog.put(102, "To Kill a Mockingbird");
        libraryCatalog.put(103, "1984");
        libraryCatalog.put(104, "The Great Gatsby");
        libraryCatalog.put(105, "Moby Dick");

        //methods to manage and query the library catalog
        //size(): Print the number of books currently in the catalog
        System.out.println("Initial number of books in catalog: " + libraryCatalog.size());

        //isEmpty(): Check if the catalog is empty and print the result
        System.out.println("Is the catalog empty? " + libraryCatalog.isEmpty());

        //containsKey(102): Check if the book with ID 102 (To Kill a Mockingbird) is available in the catalog
        System.out.println("Is book with ID 102 available? " + libraryCatalog.containsKey(102));

        //containsValue("1984"): Check if the book titled "1984" is available in the catalog
        System.out.println("Is the book \"1984\" available? " + libraryCatalog.containsValue("1984"));

        //remove(105): Remove the book with ID 105 (Moby Dick) from the catalog and print the updated catalog.
        libraryCatalog.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        libraryCatalog.forEach((k, v) -> System.out.println(k + ": " + v));

        //clear(): Clear the entire catalog and check if it’s empty using isEmpty().
        libraryCatalog.clear();
        System.out.println("Is the catalog empty after clearing? " + libraryCatalog.isEmpty());

    }

}
