package org.example.e161;

public class Intern extends Employee{

    //Overrides the work Method
    public void work() {
        System.out.println("I am an Intern working");
    }

    //Overrides the takeBreak method
    protected void takeBreak() {
        System.out.println("I am an Intern taking a break");
    }

    //Overrides the attendMeeting method
    void attendMeeting() {
        System.out.println("I am an Intern attending a meeting");
    }

    //overrides the hello method
    public void hello() {
        System.out.println("method in Intern class");
    }
}
