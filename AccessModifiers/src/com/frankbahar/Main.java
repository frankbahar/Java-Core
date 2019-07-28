package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    Account frankAccount = new Account("Frank Account");
	    frankAccount.deposit(1000);
	    frankAccount.withdraw(500);
	    frankAccount.withdraw(-200);
	    frankAccount.deposit(-20);
	    frankAccount.calculateBalance();
	    frankAccount.balance=50000;
	    System.out.println("Balance on account is " + frankAccount.getBalance());
	    frankAccount.transactions.add(4500);
	    frankAccount.calculateBalance();
    }
}
