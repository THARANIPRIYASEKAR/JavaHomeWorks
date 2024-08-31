package org.example.e135;

public class SurroundSearchTerm {

    //declaring a static method surround to return a new String built from s that has every instance of the search term surrounded by parentheses

         static String surround(String s,char search_term) {

            s=s.replaceAll(String.valueOf(search_term),("("+search_term+")"));
            return s;
        }

}
