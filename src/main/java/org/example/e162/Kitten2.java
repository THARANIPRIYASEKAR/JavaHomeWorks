package org.example.e162;

public class Kitten2 extends Cat{

    //constructor to initiate parent class constructor
    public Kitten2(String type) {
        super(type);
    }

    //Override the method eat
    public void eat() {
        System.out.println(super.getType() + " eats snacks");
    }


}
