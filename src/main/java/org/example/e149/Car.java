package org.example.e149;

public class Car extends Vehicle {

    //declaring instance variable
    private String model;


    //creating constructor to initialize instance variables
    public Car(String make, int year, String model) {

        //pass values to parent call constructor
        super(make, year);

        this.model = model;

    }

    //creating method to display Car info
    public void displayCarInfo() {

        //call the method displayInfo from Vehicle class
        displayInfo();

        //print model
        System.out.println("Model: " + model);

    }
}
