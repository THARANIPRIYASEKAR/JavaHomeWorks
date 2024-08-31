package org.example.e139;

public class E139AccessModifiers {

    //protected method to replace spaces with underscore and return result
    protected String replaceSpaces(String str) {

        str = str.replaceAll(" ", "_");

        //return result
        return str;
    }

    /********default method********/
    //String replaceSpaces(String str) {
    //str=str.replaceAll(" ","_");
    //return str;
    //}

    /*********public method*********/
    //public String replaceSpaces(String str) {
    //str=str.replaceAll(" ","_");
    //return str;
    //}

    /********private method*********/
    //private String replaceSpaces(String str) {
    //str = str.replaceAll(" ", "_");
    //return str;
    //}
    //constructor for private method
    //public E139AccessModifiers(String str) {
    //System.out.println(replaceSpaces(str));
    //}


}

