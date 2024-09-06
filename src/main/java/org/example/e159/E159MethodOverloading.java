package org.example.e159;

public class E159MethodOverloading {
    public static void main(String[] args) {

        //Creates an object of the SecuritySystem class
        SecuritySystem ss = new SecuritySystem();

        //calling method performAuthentication
        ss.performAuthentication();

        //calling overloaded method performAuthentication
        ss.performAuthentication(123456);
    }
}


