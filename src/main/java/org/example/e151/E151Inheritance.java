package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {

        //creates object for SavingsAccount class
        SavingsAccount s = new SavingsAccount("John Doe", "123456789", 1000.0, 0.01);

        //depositing amount
        s.deposit(50);

        //applying interest rate
        s.applyInterest();

        //printing account info
        s.printAccountInfo();

        //creates object for CheckingAccount class
        CheckingAccount c = new CheckingAccount("Jane Smith", "987654321", 1000, -100);

        //withdrawing amount
        c.withdraw(1050);

        //printing account info
        c.printAccountInfo();

    }
}

