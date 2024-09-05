package org.example.e154;

public class Appliance {

    //Defining No-Argument Constructor
    public Appliance() {
        System.out.println("Appliance Constructor without argument");
    }

    //Defining parameterized constructor
    public Appliance(int wattage) {
        System.out.println("Wattage: " + wattage);
    }

}
