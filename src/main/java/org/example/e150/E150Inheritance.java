package org.example.e150;

public class E150Inheritance {
    public static void main(String[] args) {

        //Creating an object of the Employee class and initialize its properties
        Employee e = new Employee();
        e.setName("Joe");
        e.setLastName("Smith");
        e.setAge(35);
        e.setSalary(35000);

        //calling printEmployeeDetails method to print Employee info
        e.printEmployeeDetails();

        //Creating an object of the Student class and initialize its properties
        Student  s = new Student();
        s.setName("Adam");
        s.setLastName("Smith");
        s.setAge(15);
        s.setGrade(10);

        //calling printStudentDetails method to print Student Details
        s.printStudentDetails();

        //Creating an object of the Retiree class and initialize its properties
        Retiree  r = new Retiree();
        r.setName("Frank");
        r.setLastName("Smith");
        r.setAge(15);
        r.setSeniorActivity("tour");

        //calling printStudentDetails method to print Student Details
        r.printRetireeDetails();




    }

}
