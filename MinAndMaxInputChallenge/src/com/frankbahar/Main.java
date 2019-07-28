package com.frankbahar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //boolean first=true;
        int num=0;
        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                num = scanner.nextInt();
          //      if (first) {
            //        min = num;
              //      max = num;
                //    first=false;
              //  }
                if (num < min)
                    min=num;
                if (num > max)
                    max=num;
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min is : " + min + "Max is : "+ max);
        scanner.close();
    }
}
