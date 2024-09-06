package org.example.e162;

public class Cat extends Animal {

    //constructor to initiate parent class constructor
    public Cat(String type) {
        super(type);
    }

    //Override the method eat
    public void eat() {
        System.out.println(super.getType() + " eats");
    }

    //Override the method sleep
    protected void sleep() {
        System.out.println(super.getType() + " sleeps a lot");
    }

    //Override the method makeSound
    void makeSound() {
        System.out.println(super.getType() + " makes a sound");
    }


}
