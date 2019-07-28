package com.frankbahar;
public class Main {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-4);
        checkNumber(0);
     printMegaBytesAndKiloBytes(1024);
     System.out.println(bark(false,1));
     System.out.println(isLeapYear(2017));
     System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
     System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
     System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
     System.out.println(hasEqualSum(1,1,1));
     System.out.println(hasEqualSum(1,1,2));
     System.out.println(hasEqualSum(1,-1,0));
     System.out.println(hasTeen(9,99,19));
     System.out.println(hasTeen(23,15,42));
     System.out.println(hasTeen(22,23,24));
    }
        public static void  checkNumber(int number){
        if (number > 0)
            System.out.println("positive");
        else if (number < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes=0, remainKiloBytes=0;
        megaBytes = kiloBytes / 1024;
        remainKiloBytes = kiloBytes % 1024;
        if (kiloBytes >= 0)
            System.out.println(kiloBytes+" KB = " + megaBytes+ " MB and " + remainKiloBytes +" KB");
        else
            System.out.println("Invalid Value");
    }
    public static Boolean bark (boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        if ( barking == true && (hourOfDay < 8 || hourOfDay > 22))
            return true;
        return false;
    }
    public static boolean isLeapYear(int year){
        boolean leapYear=false;
        if (year < 1 || year > 9999)
            return leapYear;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            leapYear = true;
        return leapYear;
    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
    return ((int) (first * 1000)) == ((int) (second * 1000));
        }
    public static boolean hasEqualSum(int first, int second, int third){
        if ((first + second) == third)
            return true;
        else
            return false;

    }
    public static boolean hasTeen(int first, int second, int third){
        if ((first >= 13 && first <= 19) || (second >= 13 && second
        <=19) || (third >=13 && third <= 19))
        return  true;
    return false;
    }

}