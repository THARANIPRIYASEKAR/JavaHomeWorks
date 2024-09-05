package org.example.e151;

public class CheckingAccount extends BankAccount {

    //declare instance variable
    private double overdraftLimit;

    //initialize instance variables
    public CheckingAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit ) {

        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //method override -> to update balance based on withdrawal
    public void withdraw(double amount) {

        if (getBalance() - amount >= overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

}
