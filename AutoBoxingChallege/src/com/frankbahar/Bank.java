package com.frankbahar;

import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Branches> branches;
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branches>();
    }
    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) != null) {
            System.out.println("Branch already opened");
            return false;
        }
        this.branches.add(new Branches(branchName));
        System.out.println("Branch is added");
        return true;
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branches currentBranch = findBranch(branchName);
        if (currentBranch == null) {
            System.out.println("Do not have Branch, open branch first");
            return false;
        }
        return currentBranch.addNewCustomer(customerName,initialAmount);
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branches currentBranch = findBranch(branchName);
        if (currentBranch == null) {
            System.out.println("Do not have Branch, open branch first");
            return false;
        }
        return currentBranch.addTransaction(customerName,amount);
    }
    private Branches findBranch(String name){
        for(int i=0;i<this.branches.size();i++){
            Branches branch = this.branches.get(i);
            if (branch.getName().equals(name))
                return branch;
        }
        return null;
    }

    public boolean listOfCustomers(String branchName, boolean showTransactions){
        Branches currentBranch = findBranch(branchName);
        if (currentBranch == null) {
            System.out.println("Do not have Branch, open branch first");
            return false;
        }
        ArrayList<Customer> branchCustomers = currentBranch.getCustomers();
        System.out.println(branchName + " branch have " + branchCustomers.size() + " customers");
        for (int i = 0; i < branchCustomers.size(); i++){
            Customer branchCustomer = branchCustomers.get(i);
            System.out.println("Customer: " + branchCustomer.getName() + "[" + (i +1) + "]");
            if (showTransactions){
                System.out.println("Transactions" );
                ArrayList<Double> customerTransactions = branchCustomer.getTransactions();
                for(int j=0; j < customerTransactions.size();j++){
                    System.out.println("[" + (j + 1) + "] Amount " + customerTransactions.get(j));
                }
            }
        }
        return true;
    }
}

