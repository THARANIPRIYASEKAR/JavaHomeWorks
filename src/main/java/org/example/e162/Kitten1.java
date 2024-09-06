package org.example.e162;

public class Kitten1 extends Cat {

    //constructor to initiate parent class constructor
    public Kitten1(String type) {
        super(type);
    }

    //Override the method eat
    public void eat() {
        System.out.println(super.getType() + " eats milk");
    }

}
