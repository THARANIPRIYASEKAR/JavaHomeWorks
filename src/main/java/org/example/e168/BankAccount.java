package org.example.e168;

public class BankAccount implements BankOperations {

    //declaring instance variable
    private double balance;

    //Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //implementing deposit method from BankOperations
    public double deposit(double amount) {
        balance += amount;
        processTransaction(amount);
        return balance;
    }

    //implementing withdraw method from BankOperations
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            processTransaction(-amount);
        } else {
            System.out.println("Transaction failed: Insufficient funds");
        }
        return balance;
    }

    //implementing checkBalance method from BankOperations
    public double checkBalance() {
        return balance;
    }

    //implementing processTransaction method from Transaction
    public void processTransaction(double amount) {
        if (amount > 0) {
            System.out.println("Transaction successful: Deposited " + amount);
        } else {
            System.out.println("Transaction successful: Withdrew " + (-amount));
        }
    }

}
