package org.example.e149;

public class Vehicle {

    //declaring instance variable
    private String make;
    private int year;

    //creating constructor to initialize the instance variable
    public Vehicle(String make, int year) {

        this.make = make;
        this.year = year;

    }

    //creating method to display vehicle info
    public void displayInfo() {

        System.out.println("Vehicle: " + make + ", Year: " + year);

    }

}
