package com.frankbahar;

import com.frankbahar.series.Series;

public class Main {

    public static void main(String[] args) {
       Series series = new Series();
       for (int i=0;i<=10;i++)
          System.out.println(series.nSum(i));
       for (int i=0;i<=10;i++)
          System.out.println(series.factorial(i));
       for (int i=0;i<=10;i++)
           System.out.println(series.fibonacci(i));
    }

}

