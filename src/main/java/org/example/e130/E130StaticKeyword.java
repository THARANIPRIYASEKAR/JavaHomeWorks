package org.example.e130;

public class E130StaticKeyword {
    public static void main(String[] args) {

        //creating int 1D array
        int[] mArray = MysteryArray.mystery(new int[]{1, 2, 3, 4, 5});

        //print the results
        for (int m : mArray) {
            System.out.print(m + " ");
        }
    }
}
class MysteryArray{

    //static method mystery modifies even elements with mod of 2 and odd elements with multiple of 10
    static int[] mystery(int[] a) {

        for (int i = 0; i < a.length; i++) {

            //check for even or odd and apply changes
            if (a[i] % 2 == 0) {
                a[i] = a[i] / 2;
            } else {
                a[i] = a[i] * 10;
            }
        }

        return a;
    }

}
