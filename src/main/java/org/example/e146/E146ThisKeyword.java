package org.example.e146;

public class E146ThisKeyword {
    public static void main(String[] args) {

        //creating object to call non_argument constructor
        Employee e1 = new Employee();

        //calling printDetails method
        e1.printDetails();

        //creating object to call parameterized constructor
        Employee e2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);

        //calling printDetails method
        e2.printDetails();
    }
}
