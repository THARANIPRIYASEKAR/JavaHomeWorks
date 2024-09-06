package org.example.e165;

public class E165InterfaceClass {

    public static void main(String[] args) {

        //Creates an object of the Smartphone class and call both the turnOn() and turnOff() methods
        Smartphone sp = new Smartphone();
        sp.turnOn();
        sp.turnOff();

        //Creates an object of the Laptop class and call both the turnOn() and turnOff() methods
        Laptop l = new Laptop();
        l.turnOn();
        l.turnOff();
    }

}

