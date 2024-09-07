package org.example.e176;


import java.util.ArrayList;

public class E176List {
    public static void main(String[] args){

        //Initialize an ArrayList<Integer> to store product IDs
        ArrayList<Integer> productID = new ArrayList<>();

        //Add Product IDs
        productID.add(111);
        productID.add(222);
        productID.add(333);
        productID.add(444);
        productID.add(555);
        productID.add(666);

        //Print Product IDs
        System.out.println(productID);

        //Clear Inventory
        productID.clear();

        //Print the List to confirm
        System.out.println(productID);


    }

}
