package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0,5.0));
        for (int i=2;i < 9; i++ ){
            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000.0,(double) i)));
        }
        for (int i=8;i >1 ; i-- ){
            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000.0,(double) i)));
        }
        int count=0;
        for(int i= 10; i<50;i++){

            if (isPrime(i)){
                System.out.println(i + " Prime number ");
                count++;
            }
            if (count == 3)
                break;
        }
        int sum=0;count=0;
        for(int i=1;i<=1000;i++) {
            if ((i % 3 == 0) && (i %5 ==0)){
                System.out.println(i + " can be diveded by 3 and 5");
                sum+=i;count++;
                if (count ==5)
                    break;
            }
        }
        System.out.println("Total # can be divided by 3 and 5 is " + sum);
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
    public static boolean isPrime(int n){
        if (n==1)
            return false;
        for (int i=2; i<=(long) Math.sqrt(n);i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isOdd(int number){
        if (number <= 0)
            return false;
        if ((number %2) != 0)
            return true;
        return false;
    }
    public static int sumOdd(int start , int end){
        int sum=0;
        if (end <= 0 || start <= 0 || start > end)
            return -1;
        for (int i=start; i <= end;i++){
            if (isOdd(i))
                sum+=i;
        }
        return sum;
    }
}
