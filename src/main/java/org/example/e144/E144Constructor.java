package org.example.e144;

public class E144Constructor {
    public static void main(String[] args) {

        //create object to call main constructor
        StoreProduct sp1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);

        //call display method
        sp1.display();

        //create object to call second constructor
        StoreProduct sp2 = new StoreProduct("Paper Towels", 2.0, 24);

        //call display method
        sp2.display();

        //create object to call third constructor
        StoreProduct sp3 = new StoreProduct("Paper Towels", 2.0);

        //call display method
        sp3.display();

    }
}
