package org.example.e154;

public class WashingMachine extends Appliance {

    //defining No-Argument Constructor
    public WashingMachine() {
        System.out.println("WashingMachine Constructor without argument");
    }

    public WashingMachine(int wattage, int capacity) {

        //initializing parent class constructor with argument
        super(wattage);

        //printing the capacity
        System.out.println("Capacity: " + capacity);

    }

}
