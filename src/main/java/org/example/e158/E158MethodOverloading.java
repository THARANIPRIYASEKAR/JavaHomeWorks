package org.example.e158;

public class E158MethodOverloading {
    public static void main(String[] args) {

        //declaring loacl variable to capture the monthly payment
        double monthlyPayment;

        //Creates an object of the LoanPaymentCalculator class
        LoanPaymentCalculator lp = new LoanPaymentCalculator();

        //calling method calculatePayment for a Simple Loan and print the result
        monthlyPayment = lp.calculatePayment(10000, 5);
        System.out.println(String.format("%.2f", monthlyPayment));

        //calling method calculatePayment for a Loan with Custom Term and print the result
        monthlyPayment = lp.calculatePayment(10000, 5, 24);
        System.out.println(String.format("%.2f", monthlyPayment));

        //calling method calculatePayment for a Loan with Custom Term + Down Payment and print the result
        monthlyPayment = lp.calculatePayment(10000, 5, 24, 2000);
        System.out.println(String.format("%.2f", monthlyPayment));



    }
}

