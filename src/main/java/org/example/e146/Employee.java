package org.example.e146;

public class Employee {

    //declaring instance variables
    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    //implementing Non-Argument Constructor
    public Employee() {
    }

    //implementing parameterized constructor
    public Employee(String name, String lastName, int employeeId, String startDate, int salary) {

        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    //printDetails method to print the employee info
    public void printDetails() {

        System.out.println(name +" " + lastName + " " + employeeId + " " + startDate + " " + salary);

    }

}
