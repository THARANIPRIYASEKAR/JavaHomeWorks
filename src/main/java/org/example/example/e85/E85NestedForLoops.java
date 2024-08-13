package org.example.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {

        int count = 1;

        //upper part
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print(j + " ");
            }
            count++;
            System.out.println();
        }

        //Lower part
        for (int i= 6 ; i > 0; i--) {
            for (int j = 1; j < count-1; j++) {
                System.out.print(j + " ");
            }
            count--;
            System.out.println();
        }

    }
}
