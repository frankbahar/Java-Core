package com.frankbahar;

import java.util.ArrayList;

public class Branches {
    String name;
    private  ArrayList<Customer> customers;

    public Branches(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String custName, double initialAmount){
        if (findCustomer(custName) != null) {
            System.out.println("Contact is already on file you can only add transactions");
            return false;
        }
        this.customers.add(new Customer(custName,initialAmount));
        System.out.println("Customer " + custName + " made " + initialAmount + " transaction");
        return true;
    }
    public boolean addTransaction(String custName, double amount){
        Customer existingCustomer = findCustomer(custName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            System.out.println("Customer " + custName +" made " + amount + " transaction");
            return true;
        }
        System.out.println(custName + " is not on the system you need to add customer first");
        return false;
    }
    private Customer findCustomer(String custName){
        for(int i=0;i<this.customers.size();i++){
            Customer customer= this.customers.get(i);
            if (customer.getName().equals(custName))
                return customer;
        }
        return null;
    }
}

