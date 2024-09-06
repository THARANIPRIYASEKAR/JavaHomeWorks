package org.example.e168;

public interface Transaction {

    //declaring unimplemented method to process a financial transaction
    void processTransaction(double amount);
}

interface BankOperations extends Transaction {

    //declaring unimplemented method for basic banking operations
    double deposit(double amount);
    double withdraw(double amount);
    double checkBalance();

}

