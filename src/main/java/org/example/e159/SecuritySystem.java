package org.example.e159;

public class SecuritySystem {

    //declaring private method authenticate
    private void authenticate() {
        System.out.println("Authenticating with password");
    }

    //overloading private method authenticate with parameter
    private void authenticate(int otp) {
        System.out.println("Authenticating with OTP: " + otp);
    }

    //declaring public method to call private method
    public void performAuthentication() {
        authenticate();
    }

    //overloading public method to call overloaded private method
    public  void performAuthentication(int otp) {
        authenticate(otp);
    }


}
