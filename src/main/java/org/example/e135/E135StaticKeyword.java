package org.example.e135;

public class E135StaticKeyword {

  
    public static void main(String[] args) {

        //creating an instance for SurroundSearchTerm
        SurroundSearchTerm search = new SurroundSearchTerm();

        //calling method surround
        System.out.println(search.surround("abcabcabc",'c'));
        System.out.println(search.surround("technology",'o'));

    }
}

