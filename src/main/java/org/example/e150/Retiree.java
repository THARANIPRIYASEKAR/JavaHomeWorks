package org.example.e150;

public class Retiree extends Student{

    //declaring instance variable
    private String seniorActivity;

    //setter
    public void setSeniorActivity(String seniorActivity) {

        this.seniorActivity = seniorActivity;

    }

    //creating method printRetireeDetails  to print Retiree info
    public void printRetireeDetails() {

        System.out.println(getName() + " " + getLastName() + " " + getAge()+ " " + seniorActivity);

    }
}
