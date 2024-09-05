package org.example.e151;

public class BankAccount {

    //declare instance variable
    private String accountHolderName;
    private String accountNumber;
    private double balance;


    //initialize the instance variables
    public BankAccount(String accountHolderName, String accountNumber, double balance ) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;


    }

    //getter - to get account balance
    public double getBalance() {
        return  balance;
    }

    //setter - to update account balance
    public void setBalance(double amount) {
        this.balance =amount;

    }

    /* capture deposit amount and update the balance accordingly */
    public void deposit(double amount) {

        balance = balance + amount;

    }

    /* captures withdrawal amount and update the balance accordingly */
    public void withdraw(double amount) {

        if(balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    //Print account holder info
    public void printAccountInfo() {

        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + String.format("%.1f", balance) );
        System.out.println();

    }
}
