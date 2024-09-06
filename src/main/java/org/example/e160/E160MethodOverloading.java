package org.example.e160;

public class E160MethodOverloading {
    public static void main(String[] args) {

        //indirectly calling private methods of BankAccount by invoking its main method
        BankAccount.main(null);

        //calls static methods
        BankAccount.displayBankInfo();
        BankAccount.displayBankInfo(20);

    }



}


