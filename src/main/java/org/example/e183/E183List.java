package org.example.e183;

import java.util.LinkedList;

public class E183List {

    public static void main(String[] args) {

        //Initialize a LinkedList to store monthly sales figures
        LinkedList<Integer> monthlySales = new LinkedList<>();

        //Add Monthly Sales to the LinkedList
        monthlySales.add(11100);
        monthlySales.add(12200);
        monthlySales.add(13300);
        monthlySales.add(14400);
        monthlySales.add(15500);
        monthlySales.add(16600);

        //Calculate the Total Sales for the Year
        int sum = 0;
        for (int i : monthlySales) {
            sum += i;
        }

        //Print the final result
        System.out.println("Total sales for the year: " + sum);

    }

}