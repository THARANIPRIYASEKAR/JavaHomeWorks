package org.example.e113;

public class E113JavaMethods {
    public static void main(String[] args) {

        E113JavaMethods e = new E113JavaMethods();

        // Call method printTime with arguments 11 and 3
        e.printTime(11, 30);
    }

    // Create method printTime with two integer parameters (hours and minutes)
    // and a print statement to display the time
    public void printTime(int hours, int minutes) {
        System.out.println(hours + ":" + minutes);
    }
}

