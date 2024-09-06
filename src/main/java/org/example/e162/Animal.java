package org.example.e162;

public class Animal {

    //declaring instance variable to store the type of animal
    private String type;

    //Creates a constructor to initialize the type instance variable
    public Animal(String type) {
        this.type = type;
    }

    //getter
    public String getType() {
        return type;
    }

    // Creates a public method eat
    public void eat() {
        System.out.println("I am an animal eating");
    }

    //Creates a protected method sleep
    protected void sleep() {
        System.out.println("I am an animal sleeping");
    }

    //Creates a default method makeSound
    void makeSound() {
        System.out.println("I am an animal making sound");
    }

    //Creates a private method roam
    private void roam() {
        System.out.println("I am an animal roaming ");
    }
}
