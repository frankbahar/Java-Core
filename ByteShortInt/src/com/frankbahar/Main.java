package com.frankbahar;

public class Main {

    public static void main(String[] args) {

       int myIntValue=5;
	   byte myByteValue=6;
	   short myShortValue=11;
	   long myLongValue=50_000+10*(myByteValue+myIntValue+myShortValue);
		System.out.println("myLongValue = "+ myLongValue);
    }

}
