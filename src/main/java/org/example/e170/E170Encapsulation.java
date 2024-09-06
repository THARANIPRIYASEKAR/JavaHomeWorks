package org.example.e170;

public class E170Encapsulation {
    public static void main(String[] args) {

        // Create an object of the Customer class
        Customer customer = new Customer();

        //Use the setter methods to set the customer’s name to "Mario" and age to 32
        customer.setCustomerName("Mario");
        customer.setCustomerAge(32);

        //Use the getter methods to print the customer’s name and age
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Age: " + customer.getCustomerAge());


    }
}





