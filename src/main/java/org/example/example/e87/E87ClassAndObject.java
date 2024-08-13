package org.example.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {


        // Create the first object of the class 'Car'
        Car car1 = new Car();

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object
        car1.carColor = "Black";
        car1.carYear = 2019;
        car1.carMake = "BMW";

        // Create the second object of the class 'Car'
        Car car2 = new Car();

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object
        car2.carColor = "White";
        car2.carYear = 2018;
        car2.carMake = "Toyota";

        // Print the values of the properties for both objects in the specified format
        System.out.println("Car color is " + car1.carColor +
                " and car year is " + car1.carYear +
                " and car model is " + car1.carMake);
        System.out.println("Car color is " + car2.carColor +
                " and car year is " + car2.carYear +
                " and car model is " + car2.carMake);

    }
}
