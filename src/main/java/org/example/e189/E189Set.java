package org.example.e189;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class E189Set {
    public static void main(String[] args) {

        //Initialize a LinkedHashSet<String> to store email addresses
        //to preserve the order and to avoid duplicates
        LinkedHashSet emailAddresses = new LinkedHashSet();

        //Add Email Addresses to the LinkedHashSet
        emailAddresses.add(null);
        emailAddresses.add("john.doe@example.com");
        emailAddresses.add("jane.smith@example.com");
        emailAddresses.add("john.doe@example.com");
        emailAddresses.add("admin@event.com");
        emailAddresses.add("info@company.com");

        //Print Email Addresses Using a For-Each Loop
        System.out.println("Email List using For-Each:");
        emailAddresses.forEach(x -> System.out.println(x));
        System.out.println();

        //Print Email Addresses Using an Iterator
        Iterator iterator = emailAddresses.iterator();

        System.out.println("Email List using Iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
