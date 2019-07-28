package com.frankbahar;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1235,250,"Frank triel",
                "frank@hotmail.com", "20186445");
//        BankAccount account = new BankAccount();
        System.out.println(account.getCustName()+" has " + account.getBalance()+ "on his account # "+
           account.getNumber());
//        account.deposit(1000);
//        System.out.println(account.getCustName()+" has " + account.getBalance()+ "on his account # "+
//                account.getNumber());
//        account.withdrawal(100);
//        System.out.println(account.getCustName()+" has " + account.getBalance()+ "on his account # "+
//                account.getNumber());
        account.withdrawal(250);
        System.out.println(account.getCustName()+" has " + account.getBalance()+ "on his account # "+
                account.getNumber());
//        BankAccount munAcccount= new BankAccount("Mun","tim@email.com","1212");
//        System.out.println(munAcccount.getNumber()+" name " + munAcccount.getCustName());
        VipCustomer vipFirst= new VipCustomer("Frank", 50000,"frank@gmail.com");
        System.out.println(vipFirst.getName()+" name " + " email "+ vipFirst.getEmail()
            +" credit limit: "+vipFirst.getCreditlimit());
        VipCustomer vipSecond= new VipCustomer("2nd cust",25000);
        System.out.println(vipSecond.getName()+" name " +" email "+ vipSecond.getEmail()
            + " credit limit: "+vipSecond.getCreditlimit());
        VipCustomer vipThird= new VipCustomer();
        System.out.println(vipThird.getName()+" name " + " email "+ vipThird.getEmail()
            +" credit limit: "+vipThird.getCreditlimit());
    }
}
