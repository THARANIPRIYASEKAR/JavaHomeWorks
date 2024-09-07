package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList for Product Quantities
        ArrayList<Integer> productQuantities = new ArrayList<>();

        // Add Product Quantities
        // 3 orders of Product A with quantity 111
        productQuantities.add(111);
        productQuantities.add(111);
        productQuantities.add(111);

        // 3 orders of Product B with quantity 999
        productQuantities.add(999);
        productQuantities.add(999);
        productQuantities.add(999);

        // Step 2: Print the Results
        // Loop through the ArrayList and print each quantity
        for (Integer quantity : productQuantities) {
            System.out.println(quantity);
        }
    }

}
