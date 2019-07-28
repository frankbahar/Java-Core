package com.frankbahar;

public class Main {
    private static final double PI = 3.14159;
    public static void main(String[] args) {
	System.out.println(area(50));
	System.out.println(area(5,10));
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
    printYearsAndDays(0);
    printEqual(1,1,1);
    printEqual(1,1,2);
    printEqual(-1,-1,-1);
    printEqual(1,2,3);
    System.out.println(isCatPlaying(true,10));
    System.out.println(isCatPlaying(false,36));
    System.out.println(isCatPlaying(false,35));

    }
    public static double area (double radius){
        if (radius <0)
            return -1.0;
        return PI*(radius*radius);
    }
    public static double area (double x, double y){
        if (x <0 || y <0)
            return -1.0;
        return x*y;
    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0)
           System.out.println("Invalid Value");
        else {
           double years = minutes / (365 * 60 * 24);
           String yearsString = (int) years + " y and ";
           double days = (minutes % (365 * 60 * 24)) / (60 * 24);
           String daysString = (int) days + " d";
           System.out.println(minutes + " min = " +  yearsString + daysString);
        }
    }
    public static void printEqual(int number1, int number2, int number3){
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if ((number1 == number2) && (number1 == number3 )) {
            System.out.println("All numbers are equal");
            return;
        }
        if ((number1 != number2) && (number1 != number3 )&& (number2 != number3)) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }
    public static boolean isCatPlaying (boolean summer, int temperature){
        if (summer == true && temperature >=25 && temperature <= 45)
            return true;
        if (summer == false && temperature >=25 && temperature <= 35)
            return true;
        return false;
    }
}
