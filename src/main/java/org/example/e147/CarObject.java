package org.example.e147;

public class CarObject {

    //declaring instance variables
    private String model;
    private double price;
    private int quantity;

    //implementing constructor to initialize the instance variables
    public CarObject(String model, double price, int quantity) {

        this.model = model;
        this.price = price;
        this.quantity = quantity;

    }

    //carStockValue Method to calculate and display car stock value
    public void carStockValue() {

        double totalStockValue = price * quantity;

        System.out.println(model + " Stock Value " + totalStockValue);
    }

}
