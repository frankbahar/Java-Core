package com.frankbahar;

public class Main {

    public static void main(String[] args) {

    BankAccount account = new BankAccount("12345-678",1000);
    account.printAccountNumber();
    System.out.println("has a balance of " + account.getBalance());
    new Thread(new Runnable() {
        @Override
        public void run() {
          //  synchronized(account) {
                System.out.println("Thread 1 made 300 deposit");
                account.deposit(300);
                System.out.println("Thread 1 made 50 withdraw");
                account.withdraw(50);
                account.printAccountNumber();
                System.out.println("has a balance of " + account.getBalance());
           // }
        }
    }).start();

       new Thread(new Runnable() {
            @Override
            public void run() {
          //      synchronized(account) {
                    System.out.println("Thread 2 made 203.75 deposit");
                    account.deposit(203.75);
                    System.out.println("Thread 2 made 100 withdraw");
                    account.withdraw(100);
                    account.printAccountNumber();
                    System.out.println("has a balance of " + account.getBalance());
            //    }
            }
        }).start();
        account.printAccountNumber();
        System.out.println("has a balance of " + account.getBalance());
    }
}
