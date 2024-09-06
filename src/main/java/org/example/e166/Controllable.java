package org.example.e166;

public interface Controllable {

    //Declares an unimplemented method
    void turnOn();
}

interface Configurable {

    //Declares an unimplemented method
    void configure();
}

class SmartHomeDevice implements Controllable, Configurable {

    //Implement Method from Controllable
    public void turnOn() {
        System.out.println("Turning on Smart Home Device");
    }

    //Implement Method from Configurable
    public void configure() {
        System.out.println("Configuring Smart Home Device settings");
    }
}