package org.example.e129;

public class E129StaticKeyword {

    //Declare two static variables to hold country and continent
    static String countryName, continent;

    //create static method to display country and continent in specified format
    public void display() {
        System.out.println(countryName + " located on " + continent + " continent");
    }

    public static void main(String[] args) {

        //assign values to the static variables
        countryName = "Morocco";
        continent = "Africa";

        E129StaticKeyword e = new E129StaticKeyword();
        //call method display
        e.display();
    }
}


