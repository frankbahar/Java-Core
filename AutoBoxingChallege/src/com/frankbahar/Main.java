package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Citi");
	    bank.addNewBranch("Route 3");
	    bank.addCustomer("Route 3","Frank",175.34);
	    bank.addCustomer("Route 3","Mike",50.05);
	    bank.addCustomer("Route 3","Percy",250.13);

        bank.addNewBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);

        bank.addCustomerTransaction("Route 3","Frank",44.22);
        bank.addCustomerTransaction("Route 3","Frank",12.44);
        bank.addCustomerTransaction("Route 3","Mike",1.54);
        bank.listOfCustomers("Route 3", true);
        bank.listOfCustomers("Sydney", true);
        if (!bank.addCustomer("Melbourne","Brian",5.53)){
            System.out.println("branch does not exist");
        }
        bank.addNewBranch("Melbourne");
        if (!bank.addCustomerTransaction("Melbourne","Tim",5.53)){
            System.out.println("branch does not have customer");
        }
        if (bank.addNewBranch("Melbourne"))
            System.out.println("branch already exist");
        if (!bank.addCustomer("Route 3", "Frank", 54.23)){
            System.out.println("branch already have this customer add transactions only");
        }
    }
}
