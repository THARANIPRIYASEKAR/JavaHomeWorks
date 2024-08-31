package org.example.e137;

public class E137AccessModifiers {

    //declaring variables with different access modifiers
    private String name;
    String city;
    protected String schoolName;
    public int batchNumber;

    //declaring method display()
   public void display() {

        System.out.println("My name is " + name
                + " and I live in " + city
                + ". I study at " + schoolName
                + " in batch " + batchNumber);
    }

    public static void main(String[] args) {

        //creating an instance of E137AccessModifiers
        E137AccessModifiers a = new E137AccessModifiers();

        //assigning values to the instance variables
        a.name = "John";
        a.city = "Miami";
        a.schoolName = "Syntax";
        a.batchNumber = 9;

        //calling display() method
        a.display();

    }
}

