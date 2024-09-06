package org.example.e168;

public class E168MultipleInterface {

    public static void main(String[] args){

// Create an object of BankAccount with an initial balance
        BankAccount account = new BankAccount(0);

        // Perform deposit and withdrawal operations
        account.deposit(100.0);
        account.withdraw(50.0);
        System.out.println("Current Balance: " + account.checkBalance());
        account.withdraw(60.0);



    }
}
