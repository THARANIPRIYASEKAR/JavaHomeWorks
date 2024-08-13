package org.example.example.e13;

public class E13ShoppingCartCalculationArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare the float variables and assign values
        float item1 = 30.0f;
        float item2 = 20.0f;
        float item3 = 40.0f;

        // Step 2: Calculate the total cost
        float totalCost= item1 + item2+ item3;

        // Step 3: Apply the discount
        float discountRate = 0.1f; //10% discount
        float discountAmount = discountRate * totalCost; // Calculating  discount amount
        float finalPrice = totalCost - discountAmount; // Applying the discount
        // Step 4: Print the results
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);
    }
}
