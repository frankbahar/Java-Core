package com.frankbahar;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int sum=0;
      int counter=1;
      int num=0;
      //for (int i=1;i<=10;i++){
       while (counter <=10) {
        System.out.println("Enter number #"+ counter +": ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            num = scanner.nextInt();
            counter++;
            sum+=num;
        } else
            System.out.println("Invalid Number");
        scanner.nextLine();
      }
      System.out.println("Total sum is = " + sum);
      scanner.close();
    }
}
