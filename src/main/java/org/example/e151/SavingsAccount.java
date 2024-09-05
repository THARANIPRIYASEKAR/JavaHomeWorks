package org.example.e151;

public class SavingsAccount extends BankAccount {

    //declare instance variable
    private double interestRate;

    //initialize the instance variables
public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {

    super(accountHolderName,accountNumber,balance);
    this.interestRate = interestRate;
}


    /* calculates the interest based on the current balance and the interest rate,
    then adds this interest to the balance */
    public void applyInterest() {

        double newBalance = getBalance() + ( (interestRate/getBalance())*100);
        setBalance(newBalance);

    }
}
