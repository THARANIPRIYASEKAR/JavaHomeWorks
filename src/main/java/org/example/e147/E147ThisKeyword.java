package org.example.e147;

public class E147ThisKeyword {
    public static void main(String[] args) {

        //create object to call constructor
        CarObject c1 = new CarObject("Toyota 2019", 50000.0, 50);

        //calling carStockValue method
        c1.carStockValue();

        //create another object to call constructor
        CarObject c2 = new CarObject("BMW 2019", 10883.0 , 60);

        //calling carStockValue method
        c2.carStockValue();
    }
}
