package org.example.e164;

public class Car extends Vehicle {

    //Overriding the startEngine() Method
    public void startEngine() {
        System.out.println("Car engine started");
    }

    //Overloading the startEngine() Method
    public void startEngine(String keyType) {
        System.out.println("Car engine started with a " + keyType);
    }

}
