package com.frankbahar;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {
    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Frank", "Baha",1000, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200,true);
        assertEquals(1200,balance,0);
    }

    @Test
    public void withdraw_branch() {
        double balance = account.withdraw(600,true);
        assertEquals(400,balance,0);
    }

//    @Test this code was before jUnit4  there was no expected
//    public void withdraw_notBranch() {
//        try {
//            double balance = account.withdraw(600,false);
//            fail("Should have thrown an IllegalArugmentException");
//        } catch (IllegalArgumentException e){
//        }
//    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        double balance = account.withdraw(600,false);
        fail("Should have thrown an IllegalArugmentException");
    }

    @Test
    public void getBalance_deposit() {
        account.deposit(200.00,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @Test
    public void getBalance_withdraw() {
        account.withdraw(200.00,true);
        assertEquals(800,account.getBalance(),0);
    }

    @Test
    public void isChecking_true(){
      //  assertEquals(true,account.isChecking());
      // we can write   assertTrue(account.isChecking()); also
        assertTrue(account.isChecking(), "The account is NOT a checking account");
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = " + count++);
    }
}