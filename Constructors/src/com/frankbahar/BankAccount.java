package com.frankbahar;

public class BankAccount {
    private  int number;
    private double balance;
    private String custName;
    private String email;
    private String phone;

    public  BankAccount(){
        this(522211,120,"Defualt","Default","Default");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String custName, String email, String phone) {
        this(9999,100.55,custName, email, phone);
    }

    public BankAccount(int number, double balance, String custName, String email, String phone){
        this.number=number;
        this.balance=balance;
        this.custName=custName;
        this.email=email;
        this.phone=phone;
    }

    public void setNumber(int number){
        if (number < 1)
            this.number=1;
        else
            this.number=number;
    }
    public void setBalance(double balance){
        if (number < 1)
            this.balance=1;
        else
            this.balance=balance;
    }
    public void setCustName(String custName){
        this.custName=custName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustName(){
        return this.custName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdrawal(double amount){
        if (amount > this.balance)
            System.out.println("Unsufficient fund available balance is " +this.balance) ;
        else
            this.balance-=amount;
    }
}
