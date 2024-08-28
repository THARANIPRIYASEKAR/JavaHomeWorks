package org.example.e119;

public class E119JavaMethods {

    //create a method to replace all the instance of the given character with *
     public static String censorLetter (String s,char c) {
        return s.replace(c,'*');
    }

    public static void main(String[] args) {

        //execute the method
        System.out.println(censorLetter("computer science",'e'));
        System.out.println(censorLetter("trick or treat",'t'));

    }


}
