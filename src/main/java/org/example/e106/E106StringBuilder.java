package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {

        //Instantiate an object of the StringBuffer class
        StringBuffer sb = new StringBuffer();

        //Append Values
        sb.append("Hello").append("\sWorld");

        //convert StringBuffer to a string
        String str = sb.toString();

        //Convert to uppercase
        str = str.toUpperCase();

        //print the string
        System.out.println(str);

    }
}
