package org.example.e150;

public class Employee extends Person {

    //declaring instance variable
    private int salary;

    //setter
    public void setSalary (int salary){

        this.salary=salary;
    }

    //creating method to print Employee Details
    public void printEmployeeDetails (){

        System.out.println(getName() + " " + getLastName() + " " + getAge()+ " " + salary);

    }

}
