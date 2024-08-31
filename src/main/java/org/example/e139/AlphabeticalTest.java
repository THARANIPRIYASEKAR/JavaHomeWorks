package org.example.e139;

public class AlphabeticalTest {

    public static void main(String[] args) {

        //for public/default/protected
        E139AccessModifiers e = new E139AccessModifiers();
        System.out.println(e.replaceSpaces("hello world"));
        System.out.println(e.replaceSpaces("java is fun"));
        System.out.println(e.replaceSpaces("i love coding"));

        /********private method********/

        //E139AccessModifiers e1 = new E139AccessModifiers("hello world");
        //E139AccessModifiers e2 = new E139AccessModifiers("java is fun");
        //E139AccessModifiers e3 = new E139AccessModifiers("i love coding");
    }
}
