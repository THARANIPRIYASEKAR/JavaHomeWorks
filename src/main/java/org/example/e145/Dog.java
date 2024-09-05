package org.example.e145;

public class Dog {

    //declaring instance variables
    private String dogName;
    private double dogWeight;
    private static String dogBreed = "Mutt";

    //implementing constructor to initialize the instance variables
    public Dog(String dogName, double dogWeight) {

        this.dogName = dogName;
        this.dogWeight = dogWeight;

    }

    //displayDetails method to print dog details
    public void displayDetails() {

        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }

}
