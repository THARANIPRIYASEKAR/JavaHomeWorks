package org.example.e143;

public class Car {

    //Declaring Instance Variables
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    //constructor 1 -> takes all the parameters
    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {

        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    //constructor 2 -> takes 4 parameters except numberOfDoors
    public Car(String make, String model, int topSpeed, double price) {

        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    //constructor 3 -> takes 3 the parameters except make and model
    public Car(int numberOfDoors, int topSpeed, double price) {

        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;

    }

    //constructor 4 -> takes 3 parameters except topspeed and price
    public Car(String make, String model, int numberOfDoors) {

        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;

    }

    public void display() {

        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);

    }

}
