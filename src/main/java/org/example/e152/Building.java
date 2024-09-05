package org.example.e152;

public class Building {

    //declare instance variable
    private String location;

    //parameterized constructor
    public Building (String location) {

        this.location = location;
        System.out.println(this.location);
    }

    //default constructor
    public Building () {
        System.out.println("Building Constructor");
    }


}
