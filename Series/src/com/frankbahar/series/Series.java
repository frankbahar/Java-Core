package com.frankbahar.series;

public class Series {

    public static long nSum(int n){
        if (n >=0)
            return (n*(n+1)/2);
        else
            return -1;
    }

    public static long factorial(int n){
        if (n < 0)
            return -1;
        long factorial = 1;
        for(int i=1 ; i<=n ;i++)
            factorial*=i;
        return factorial;
    }

    public static long fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
