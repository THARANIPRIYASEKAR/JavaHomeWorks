package org.example.e138;

public class E138AccessModifiers {

    public static void main(String[] args) {

        //creating object from class AnotherClass
        AnotherClass a = new AnotherClass();

        //access methods of class AccessModifierTest
        System.out.println(a.defaultMethod());
        System.out.println(a.protectedMethod());
        System.out.println(a.publicMethod());
    }
}

class AnotherClass {

    //declaring private method
    private String privateMethod() {

        return "private";
    }

    //declaring default method
    String defaultMethod() {

        return "default";
    }

    //declaring protected method
    protected String protectedMethod() {

        return "protected";
    }

    //declaring public method
    public String publicMethod() {

        return "public";
    }

}
