package org.example.e143;

public class E143Constructor {

    public static void main(String[] args) {

        //creating object to call constructor 1
        Car c1 = new Car("Toyota", "Prius", 4, 120, 30000.0);

        //calling display method
        c1.display();

        //creating object to call constructor 2
        Car c2 = new Car("Toyota", "Prius", 120, 30000.0);

        //calling display method
        c2.display();

        //creating object to call constructor 3
        Car c3 = new Car(4, 120, 30000.0);

        //calling display method
        c3.display();

        //creating object to call constructor 4
        Car c4 = new Car("Toyota", "Prius", 4);

        //calling display method
        c4.display();


    }
}


