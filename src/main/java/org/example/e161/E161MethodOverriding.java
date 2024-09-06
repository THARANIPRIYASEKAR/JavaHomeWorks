package org.example.e161;

public class E161MethodOverriding {
    public static void main(String[] args) {

        //Create objects of Manager, Developer, and Intern classes and store in an array of Employee type
        Employee[] emp = {new Manager(), new Developer(), new Intern() };

        //Loop through the array and call the hello() method for each object
        for(Employee e : emp) {
            e.hello();
        }

        // creates an object of the Developer class and call the work, takeBreak, and attendMeeting methods
        Developer dev = new Developer();

        //call its methods
        dev.work();
        dev.takeBreak();
        dev.attendMeeting();

    }

}



