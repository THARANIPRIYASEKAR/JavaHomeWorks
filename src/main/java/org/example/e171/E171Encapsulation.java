package org.example.e171;

public class E171Encapsulation {
    public static void main(String[] args){

        //Create an object of the Employee class
        Employee employee = new Employee();

        //Use the getter methods to print the employee’s name and age
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
    }
}



