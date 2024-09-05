package org.example.e155;

public class E155SuperKeyword {
    public static void main(String[] args) {

        //Creates an object of the Employee class
        Employee e = new Employee();
    }
}

class Company {

    //Defining No-Argument Constructor or Default Constructor
    public Company() {
        System.out.println("Company Established");
    }

}

class Department extends Company {

    //Defining No-Argument Constructor or Default Constructor
    public Department() {
        System.out.println("Department Created");
    }

}

class Employee extends Department{

    //Defining No-Argument Constructor or Default Constructor
    public Employee() {
        System.out.println("Employee Hired");
    }


}