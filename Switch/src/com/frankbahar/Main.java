package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    int value =3;
	    switch (value) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
         case 3: case 4: case 5:
             System.out.println("Value was 3 or 4 or 5");
             System.out.println("Actually it was a "+value);
             break;
         default:
             System.out.println("Value was not 1 and 2 ");
             break;
        }
        char mychar = 'F';
        switch (mychar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Value was found");
                break;
            default:
                System.out.println("Value was not found");
                break;
        }
        String month ="JuNe";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
             default:
                 System.out.println("Not sure");
                 break;
        }
        printDayOfTheWeek(-100);
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(isLeapYear(2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(1,-2020));
        System.out.println(isLeapYear(2020));
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
    public static void printNumberInWord(int num){
        switch (num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }
    public static boolean isLeapYear(int year){
        if (year < 1 || year >9999)
            return false;
        if ((year %4) == 0 && (year % 100) !=0 )
            return true;
        if (year % 400 == 0)
            return true;
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12)
            return -1;
        if (year < 1 || year > 9999)
            return -1;
        if ((isLeapYear(year) == true) && month == 2)
            return 29;
        if ((isLeapYear(year) == false) && month == 2)
            return 28;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            default:
                return 30;

        }

    }
}
