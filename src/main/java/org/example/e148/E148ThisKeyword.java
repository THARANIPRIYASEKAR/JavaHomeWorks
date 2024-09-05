package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args) {

        double totalSum, sum1, sum2;

        //creating 2 objects to call constructor with different values
        ShoppingStore s1 = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore s2 = new ShoppingStore("Mattress", 219.59, 2);

        //calling the method to fetch the item total price and store it in sum1 and sum2
        sum1 = s1.itemTotalPrice();
        sum2 = s2.itemTotalPrice();

        //calculating total sum of the purchase
        totalSum = sum1 + sum2;

        //print the total sum
        System.out.println("You purchased " + totalSum + " Today");

    }
}
   