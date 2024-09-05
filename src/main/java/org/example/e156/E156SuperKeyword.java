package org.example.e156;

public class E156SuperKeyword {

    public static void main(String[] args) {

        //Creates object of the Dog class
        Dog d = new Dog();

        //calls displaySound method
        d.displaySound();

}

}

class Animal {

    //instance variable
    String sound ="Some generic animal sound";
}

class Dog extends Animal{

    //instance variable
    String sound ="Bark";

    //method to print sound variable from the Dog class, followed by the value of the sound variable from the Animal class
    public void displaySound() {

        System.out.println(sound);
        System.out.println(super.sound);
    }
}

