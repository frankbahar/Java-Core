package com.frankbahar;

public class Main {

    public static void main(String[] args) {
//        String numberAsString = "2018.125";
//        System.out.println("numberAsString= " + numberAsString);
//        double number = Double.parseDouble(numberAsString);
//        System.out.println("number = " + number);
//        numberAsString += 1;
//        number += 1;
//        System.out.println("numberAsString= " + numberAsString);
//        System.out.println("number = " + number);
//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 0, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 12));
//        System.out.println(canPack(2, 10, 18));
//        System.out.println(canPack(6, 2, 17));
   //     System.out.println(getLargestPrime(217));
           printSquareStar(2);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        return (((5 * bigCount) + smallCount) >= goal && (goal % 5) <= smallCount);
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;
        int factor = number;
        for (int i = 2; i < number/2; i++) {
            while (factor%i==0) {
                if (factor == i) {
                    break;
                }
                factor /= i;
            }
        }
        return factor;
    }
    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for(int row=1;row<=number;row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number || row == col || col == (number - row + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}