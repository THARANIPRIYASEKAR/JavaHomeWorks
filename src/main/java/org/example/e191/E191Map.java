package org.example.e191;

import java.util.LinkedHashMap;

public class E191Map {

    public static void main(String[] args) {

        //Initialize a LinkedHashMap to store product names as keys and their corresponding prices as values
        LinkedHashMap<String, Double> productPrices = new LinkedHashMap<>();

        //Add the products and its prices to the LinkedHashMap
        productPrices.put("Laptop", 1200.99);
        productPrices.put("Smartphone", 799.99);
        productPrices.put("Tablet", 499.99);
        productPrices.put("Smartwatch", 199.99);
        productPrices.put("Headphones", 149.99);

        //Print All Products and Their Prices from the LinkedHashMap
        System.out.println("Product Catalog:");
        productPrices.forEach((k, v) -> System.out.println(k + ": $" + v));


    }


}
