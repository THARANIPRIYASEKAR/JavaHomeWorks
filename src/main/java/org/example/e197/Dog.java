package org.example.e197;

public class Dog {

    //Instance variables
    private String name;
    private String breed;
    private int age;

    // constructor to initialize the attributes
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String toString() {
        return "Dog{name='" + this.name + "', breed='" + this.breed + "', age=" + this.age + "}";
    }


}
