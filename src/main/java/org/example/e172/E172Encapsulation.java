package org.example.e172;

public class E172Encapsulation {
    public static void main(String[] args){

        //Create an object of the Customer class and assign values
        Customer customer = new Customer(1234567890L, "Sarah Connor", "sarah.connor@example.com", 15000.0);

        //Print the customer's account and personal details using getter methods
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Full Name: " + customer.getFullName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Account Balance: " + customer.getBalance());

    }

}


