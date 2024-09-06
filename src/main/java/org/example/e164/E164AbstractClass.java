package org.example.e164;

public class E164AbstractClass {
    public static void main(String[] args){

        //creates an object of the Car class
        Car c = new Car();

        //calling startEngine method with no parameter
        c.startEngine();

        //calling startEngine method with string parameter
        c.startEngine("smart key");

        //calling stopEngine method from Vehicle class
        c.stopEngine();

    }
}


