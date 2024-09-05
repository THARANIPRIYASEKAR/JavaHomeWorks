package org.example.e158;

public class LoanPaymentCalculator {

    private double  payment;

    //creates method calculatePayment to calculate monthly payment for a loan with fixed term - 12
    public double calculatePayment(double loanAmount, double interestRate) {

        //calculating monthly payment for a simple loan
        payment = (loanAmount * (1 + interestRate/100))/12;
        return  payment;

    }

    //creates overloaded method calculatePayment to calculate monthly payment for a loan with Custom Term
    public double calculatePayment(double loanAmount, double interestRate, int numberOfMonths) {

        //calculating monthly payment
        payment = (loanAmount * (1 + interestRate/100))/numberOfMonths;
        return payment;

    }

    //creates overloaded method calculatePayment to calculate monthly payment for a loan with Custom Term and Down Payment
    public double calculatePayment(double loanAmount, double interestRate, int numberOfMonths, double downPayment) {

        //calculating monthly payment
        payment = ((loanAmount- downPayment) * (1 + interestRate/100))/numberOfMonths;
        return  payment;

    }
}
