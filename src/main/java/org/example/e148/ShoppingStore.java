package org.example.e148;

public class ShoppingStore {

    //declaring instance variables
    private String item;
    private double price;
    private int quantity;

    //implementing constructor to initialize instance variables
    public ShoppingStore(String item, double price, int quantity) {

        this.item = item;
        this.price = price;
        this.quantity = quantity;

    }

    //creating method itemTotalPrice to calculate and display item total price
    public double itemTotalPrice() {

        double totalValue = price * quantity;

        //print item total price
        System.out.println(item + " Total Value " + totalValue);

        return totalValue;

    }
}
