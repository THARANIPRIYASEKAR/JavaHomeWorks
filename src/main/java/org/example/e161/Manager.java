package org.example.e161;

public class Manager extends Employee {

    //Overrides the work Method
    public void work() {
        System.out.println("I am a Manager working");
    }

    //Overrides the takeBreak method
    protected void takeBreak() {
        System.out.println("I am Manager taking a break");
    }

    //Overrides the attendMeeting method
    void attendMeeting() {
        System.out.println("I am a Manager attending a meeting");
    }

    //overrides the hello method
    public void hello() {
        System.out.println("method in Manager class");
    }
}
