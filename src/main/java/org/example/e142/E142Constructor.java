package org.example.e142;

public class E142Constructor {
    public static void main(String[] args) {

        //creates an object s1 for SyntaxTechnologies class and initiate non-argument constructor
        SyntaxTechnologies s1 = new SyntaxTechnologies();

        //creates an object s2 for SyntaxTechnologies class and initiate parameterized constructor
        SyntaxTechnologies s2 = new SyntaxTechnologies("Syntax", 6, 2020, "07302020");

        //calling display method with objects s1 and s2
        s1.display();
        s2.display();
    }
}

