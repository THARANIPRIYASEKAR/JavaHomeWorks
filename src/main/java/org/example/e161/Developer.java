package org.example.e161;

public class Developer extends Employee {

    //Overrides the work Method
    public void work() {
        System.out.println("I am a Developer working");
    }

    //Overrides the takeBreak method
    protected void takeBreak() {
        System.out.println("I am a Developer taking a break");
    }

    //Overrides the attendMeeting method
    void attendMeeting() {
        System.out.println("I am a Developer attending a meeting");
    }

    //overrides the hello method
    public void hello() {
        System.out.println("method in Developer class");
    }
}
