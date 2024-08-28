package org.example.e122;

public class E122Variables {

    //Declare 3 instance variables
    String countryName;
    String capital;
    int populationSize;

    // Create a method to display values of instance variables
    public void display() {
        System.out.println("The capital of " + countryName
                + " is " + capital
                + " and population is " + populationSize);
    }
    public static void main(String[] args) {

        // Create 2 instances of the class
        E122Variables d1 = new E122Variables();
        E122Variables d2 = new E122Variables();

        // Assign values to variables for the first instance
        d1.countryName = "USA";
        d1.capital = "Washington DC";
        d1.populationSize = 330000000;

        // Execute the method to display values for the first instance
        d1.display();

        // Assign values to variables for the second instance
        d2.countryName = "Kazakhstan";
        d2.capital = "Astana";
        d2.populationSize = 18500000;

        // Execute the method to display values for the second instance
        d2.display();

    }
}
