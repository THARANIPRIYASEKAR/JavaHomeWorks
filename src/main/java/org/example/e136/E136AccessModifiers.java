package org.example.e136;

public class E136AccessModifiers {

    //creating methods with different modifiers

    //private method
    private void privateMethod() {
        System.out.println("This is Private Method");
    }

    public static void main(String[] args) {
        E136AccessModifiers a = new E136AccessModifiers();
        a.privateMethod();

        AccessTest at = new AccessTest();
        at.defaultMethod();
        at.protectedMethod();
        at.publicMethod();

    }
}

class AccessTest {

    //default method
    void defaultMethod() {
        System.out.println("This is Default Method");
    }

    //protected method
    protected void protectedMethod() {
        System.out.println("This is Protected Method");
    }

    //public method
    public void publicMethod() {
        System.out.println("This is Public Method");
    }
}

