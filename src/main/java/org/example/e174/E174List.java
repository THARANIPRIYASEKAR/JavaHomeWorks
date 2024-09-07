package org.example.e174;

import java.util.ArrayList;

public class E174List {
    public static void main(String[] args){

        //Initialize an ArrayList
        ArrayList<Integer> productID = new ArrayList<>();

        //Add Product IDs
        productID.add(1011);
        productID.add(1022);
        productID.add(1033);
        productID.add(1044);
        productID.add(1055);
        productID.add(1066);

        //Retrieve Specific Product IDs and print
        System.out.println(productID.get(0));
        System.out.println(productID.get(2));
        System.out.println(productID.get(4));

    }

}
