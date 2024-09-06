package org.example.e169;

public class E169Encapsulation {
    public static void main(String[] args) {

        //Create an object of the Employee class
        Employee employee = new Employee();

        //Use the setter methods to set the employee’s name to "John" and age to 30
        employee.setEmpName("John");
        employee.setEmpAge(30);

        //Use the getter methods to print the employee’s name and age
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());


    }
}
