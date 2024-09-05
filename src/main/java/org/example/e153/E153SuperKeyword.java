package org.example.e153;

public class E153SuperKeyword {
    public static void main(String[] args) {

        //Creating an object of the Car class to trigger the constructor in the Car class
        Car c = new Car();
    }
}
class Vehicle {

    //Defining a constructor with no parameters
    public Vehicle () {
        System.out.println("This is the Vehicle constructor");
    }


}
class Car extends Vehicle {

    //Defining a constructor with no parameters
    public Car() {

        //explicitly calling the parent class (Vehicle) constructor
        super();
    }
}
