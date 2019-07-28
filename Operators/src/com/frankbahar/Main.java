package com.frankbahar;

import javax.crypto.SecretKeyFactory;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);
        boolean isAlient = false;
        if (isAlient == true)
            System.out.println("It is not an alient!");
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");
        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score anad less than 100");
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");
        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");
        boolean isCar = false;
        if (isCar)
            System.out.println("This is not suppose to happen");
        isCar=true;
        boolean wasCar=isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");
        double doubleValue=20;
        double secondDoubleValue=80;
        double newResult = ((doubleValue + secondDoubleValue) * 25)%40;
        if (newResult<=20)
            System.out.println("Total was over the limit");
        }
}
