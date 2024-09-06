package org.example.e162;

public class E162MethodOverriding {
    public static void main(String[] args) {


        //Create objects of Cat, Kitten1, Kitten2 and Kitten3 classes and store in an array of Employee type
        Animal[] cat = {new Cat("Cat"),new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3") };

        //Loop through the array and call the eat and sleep methods for each object
        for(Animal c : cat) {
            c.eat();
            c.sleep();
        }

        //call the makeSound method from Cat class
        cat[0].makeSound();

    }
}
