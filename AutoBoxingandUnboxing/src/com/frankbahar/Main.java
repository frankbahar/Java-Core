package com.frankbahar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String [] strArray = new String[10];
	    int [] intArray = new int[10];

        ArrayList<String>strArrayList = new ArrayList<String>();
        strArrayList.add("Frank");
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
        ArrayList<Integer>intArrayList = new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i=0; i<=10;i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.00; dbl <= 10.0; dbl +=.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i=0; i<myDoubleValues.size();i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
