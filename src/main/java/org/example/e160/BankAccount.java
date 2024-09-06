package org.example.e160;

public class BankAccount {

    //creates private method
    private void displayInfo() {
        System.out.println("private displayInfo method");
    }

    //overload private method with parameter
    private void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }

    //creates static method displayBankInfo
    static void displayBankInfo() {
        System.out.println("static method without parameter");
    }

    //overloads static method displayBankInfo
    static void displayBankInfo(int branches) {
        System.out.println("static method with int parameter: " + branches);
    }

    public static void main(String[] args) {

        //creates object for BankAccount class
        BankAccount b = new BankAccount();
        b.displayInfo();
        b.displayInfo(5000);
    }
}
