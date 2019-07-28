package com.frankbahar;

public class Main {

    public static void main(String[] args) {
    // widht of int = 32 (4 bytes).
    int myIntValue=5/3;
    // widht of float 32 (4 bytes)
	float myFloatValue=5f/3f;
	// widht of double = 64 (8 bytes).
	double myDoubleValue=5d/3d;
	System.out.println("myIntValue="+myIntValue);
	System.out.println("myFloatValue="+myFloatValue);
	System.out.println("myDoubleValue="+myDoubleValue);
     double poundValue=11.5d;
     double kiloValue=poundValue*0.45359237;
     System.out.println("KiloValue"+kiloValue);
     double pi = 3.141_592d;
    }
}
