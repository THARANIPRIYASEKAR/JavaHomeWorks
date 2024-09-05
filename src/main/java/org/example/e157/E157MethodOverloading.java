package org.example.e157;

public class E157MethodOverloading {

    public static void main(String[] args) {

        //Creates an object of the TransactionCalculator class
        TransactionCalculator tc = new TransactionCalculator();
        System.out.println(tc.calculateProfit(100, 20, 30, 10));
        System.out.println(tc.calculateProfit(80, 30, 20));
        System.out.println(tc.calculateProfit(50, 30));
    }
}

class TransactionCalculator {

    //declaring local variable
    private int profit;

    //creates method calculateProfit that accepts 2 arguments
    public int calculateProfit(int totalRevenue, int costOfTransc1) {

        //calculating profit and return it
        profit = totalRevenue - costOfTransc1;
        return  profit;
    }

    //overloaded method calculateProfit that accepts 3 arguments
    public int calculateProfit(int totalRevenue, int costOfTransc1, int costOfTransc2) {

        //calculating profit and return it
        profit = totalRevenue - (costOfTransc1 + costOfTransc2);
        return  profit;
    }

    //another overloaded method calculateProfit that accepts 4 arguments
    public int calculateProfit(int totalRevenue, int costOfTransc1, int costOfTransc2, int costOfTransc3) {

        //calculating profit and return it
        profit = totalRevenue - (costOfTransc1 + costOfTransc2 + costOfTransc3);
        return  profit;
    }

}

