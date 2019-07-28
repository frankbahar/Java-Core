package com.frankbahar;

import java.util.Scanner;

public class Main {
	private static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
//	    int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//	    double [] myDoubleArray = new double[10];
//	    System.out.println(myIntArray[0]);
//		System.out.println(myIntArray[5]);
//		System.out.println(myIntArray[6]);
//		printArray(myIntArray);
//    }
//    public static void printArray(int [] array){
//    	for(int i=0;i<array.length;i++)
//		System.out.println(array[i]);
//
		int [] myIntegers = getIntegers(5);
		for (int i=0;i<myIntegers.length;i++){
			System.out.println("Element " + i +" typed values was " + myIntegers[i]);
		}
		System.out.println("Average is "+ getAvarage(myIntegers));

	}
	public static int [] getIntegers(int number){
    	System.out.println("Enter " + number + " integer values.\r");
    	int [] values = new int[5];
    	for (int i=0;i<values.length;i++){
    		values[i]=scanner.nextInt();
		}
    	return values;
	}
	public static double getAvarage(int []values){
		double total=0;
		for (int i=0;i<values.length;i++){
			total+=values[i];
		}
		return total/values.length;
	}
}
