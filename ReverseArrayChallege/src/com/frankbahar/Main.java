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
        printArray(myIntegers);
        reverseArray(myIntegers);
        printArray(myIntegers);
    }

    public static int[] readIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void reverseArray(int[] values) {
        int temp = 0;
        for (int i = 0; i < values.length / 2; i++) {
            temp = values[i];
            values[i] = values[(values.length - 1-i)];
            values[values.length - 1-i] = temp;
        }
    }
    public static void printArray(int [] array){
        for(int i=0;i<array.length;i++)
                System.out.println(array[i]);
    }
}