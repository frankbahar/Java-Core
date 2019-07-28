package com.frankbahar;
import java.util.Scanner;
public class Main {
    private static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
	    printArray(myIntegers);
		myIntegers = sortArray(myIntegers);
        printArray(myIntegers);
    }
    public static int [] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int [] values = new int[5];
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static int [] sortArray(int []values){
        for (int i=0;i<values.length;i++) {
            int temp = 0;
            for (int j = i; j < values.length; j++) {
                if (values[j] > values[i]) {
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        return values;
    }
    public static void printArray(int [] array){
    	for(int i=0;i<array.length;i++)
		System.out.println(array[i]);
    }
}
