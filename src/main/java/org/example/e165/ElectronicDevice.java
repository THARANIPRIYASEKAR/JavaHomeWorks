package org.example.e165;

public interface ElectronicDevice {

    //Declaring two unimplemented methods
    void turnOn();
    void turnOff();

}

class Smartphone implements ElectronicDevice{

    //Implement Methods from parent class
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }

    public  void turnOff() {
        System.out.println("Smartphone is turning off");
    }

}

class Laptop implements ElectronicDevice{

    //Implement Methods from parent class
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    public  void turnOff() {
        System.out.println("Laptop is turning off");
    }

}