package org.example.e167;

public interface BaseDeviceInterface {

    //Declares an unimplemented method
    void basicFunctionality();
}

interface AdvancedDeviceInterface extends BaseDeviceInterface {

    //Declares an unimplemented method
    void advancedFunctionality();
}

class SmartDevice implements  AdvancedDeviceInterface {

    //Implement Method from BaseDeviceInterface
    public void basicFunctionality() {
        System.out.println("Basic Functionality: Device is turning on");
    }

    //Implement Method from AdvancedDeviceInterface
    public void advancedFunctionality() {
        System.out.println("Advanced Functionality: Device is adjusting settings");
    }
}
