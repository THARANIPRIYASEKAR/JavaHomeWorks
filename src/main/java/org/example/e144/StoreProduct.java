package org.example.e144;

public class StoreProduct {

    //declaring instance variables
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    //main constructor
    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {

        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;

    }

    //second constructor
    public StoreProduct(String label, double price, int stock) {

        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;

    }

    //third constructor
    public StoreProduct(String label, double price) {

        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = 0;

    }

    //display method to print out the values of all instance variables
    public void display() {

        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);


    }
}
