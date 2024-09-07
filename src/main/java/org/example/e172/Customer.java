package org.example.e172;

public class Customer {

    //Declare instance variables
    private long accountNumber;
    private String fullName;
    private String email;
    private double balance;

    // Constructor to initialize all variables
    public Customer(long accountNumber, String fullName, String email, double balance) {
        this.accountNumber = accountNumber;
        this.fullName = fullName;
        this.email = email;
        this.balance = balance;
    }

    //Getter and Setter Methods
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accNum) {
        this.accountNumber = accNum;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
