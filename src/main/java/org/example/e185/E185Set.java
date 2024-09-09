package org.example.e185;

import java.util.HashSet;

public class E185Set {
    public static void main(String[] args) {

        //Initialize a HashSet<Integer> to store customer IDs for a retail order system
        HashSet<Integer> customerID = new HashSet<>();

        //Add Customer IDs to the HashSet
        customerID.add(1001);
        customerID.add(1002);
        customerID.add(1001);
        customerID.add(1003);
        customerID.add(1002);
        customerID.add(1004);

        //Print Each Unique Customer ID
        for(Integer x: customerID){
            System.out.println(x);
        }



}
}

