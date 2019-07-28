package com.frankbahar;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many integer you want to enter : ");
        int count = scanner.nextInt();
        int[] myIntegers = readIntegers(count);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typed values was " + myIntegers[i]);
        }
        System.out.println("Min is " + findMin(myIntegers));

    }

    public static int[] readIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < min)
                min = values[i];
        }
        return min;
    }
}