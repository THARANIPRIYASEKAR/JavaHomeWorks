package org.example.e150;

public class Student extends Employee {

    //declaring instance variable
    private int grade;

    //setter
    public void setGrade(int grade) {

        this.grade = grade;

    }

    //creating method printStudentDetails  to print student info
    public void printStudentDetails() {

        System.out.println(getName() + " " + getLastName() + " " + getAge()+ " " + grade);

    }
}
