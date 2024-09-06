package org.example.e164;

public abstract class Vehicle {

    //declaring abstract method
    public abstract void startEngine();

    //implementing non-abstract method
    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }

}
