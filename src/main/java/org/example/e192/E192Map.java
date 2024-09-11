package org.example.e192;

import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){

        //Initialize a TreeMap<String, String> to store product IDs as keys
        //and their corresponding product names as values
        TreeMap<String, String> products = new TreeMap<>();

        //Add Product Details to the TreeMap
        products.put("1 item","apple");
        products.put("2 item","banana");
        products.put("3 item","pear");
        products.put("4 item","tomato");
        products.put("5 item","mango");
        products.put("6 item","kiwi");

        //Extract and Print All Keys and Their Values from the TreeMap
        products.forEach((k,v) -> System.out.println("Key is " + k + " and value is " + v));



    }

}