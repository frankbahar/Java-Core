package com.frankbahar;

public class Main {

    public static void main(String[] args) {
//	System.out.println("the sum of the djits in number 125 is "+ sumDigits(125));
//	System.out.println("the sum of the djits in number -125 is "+ sumDigits(-125));
//	System.out.println("the sum of the djits in number 4 is "+ sumDigits(4));
//	System.out.println("the sum of the djits in number 32123 is "+ sumDigits(32123));
//	System.out.println(sumFirstAndLastDigit(257));
//	System.out.println(sumFirstAndLastDigit(0));
//    System.out.println(sumFirstAndLastDigit(5));
//    System.out.println(sumFirstAndLastDigit(-10));
//    System.out.println(getEvenDigitSum(123456789));
//    System.out.println(getEvenDigitSum(252));
//    System.out.println(getEvenDigitSum(-22));
  //  System.out.println(hasSharedDigit(12,23));
   // System.out.println(hasSharedDigit(9,99));
    //System.out.println(hasSharedDigit(12,13));
    // System.out.println(hasSameLastDigit(41,22,71));
    //  System.out.println(hasSameLastDigit(23,32,42));
     // System.out.println(hasSameLastDigit(9,99,999));
     //    System.out.println(getGreatestCommonDivisor(12,30));
      //  System.out.println(getGreatestCommonDivisor(25,15));
      //  System.out.println(getGreatestCommonDivisor(9,18));
      //  System.out.println(getGreatestCommonDivisor(81,153));
    //    printFactors(6);
      //  printFactors(32);
      //  printFactors(10);
      //  printFactors(-1);
   //     System.out.println(isPerfectNumber(6));
   //     System.out.println(isPerfectNumber(28));
   //     System.out.println(isPerfectNumber(5));
   //     System.out.println(isPerfectNumber(-1));
       // System.out.println(reverse(-121));
      //  System.out.println(reverse(1212));
      //  System.out.println(reverse(1234));
      //   System.out.println(getDigitCount(0));
        //System.out.println(getDigitCount(101));
        //System.out.println(getDigitCount(1000));
      //  System.out.println(getDigitCount(5200));
     //   System.out.println("123");
      //  numbersToWords(reverse(123));
        System.out.println("1010");
        numbersToWords(1010);
        System.out.println("1000");
        numbersToWords(1000);
        System.out.println("-12");
        numbersToWords(-12);
    }
    private static int sumDigits(int number){
        if (number < 10)
            return -1;
        int sum=0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
    public static boolean isPalindrome ( int number){
       int palindrome = number; // copied number into variable
       int reverse = 0;

       while (palindrome != 0) {
          int remainder = palindrome % 10;
          reverse = reverse * 10 + remainder;
          palindrome = palindrome / 10;
       }

       // if original and reverse of number is equal means
       // number is palindrome in Java
       if (number == reverse) {
            return true;
       }
       return false;
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0)
            return -1;
        int firstdigit= number%10;
        int lastdigit=0;
        while (number > 0) {
            lastdigit = number % 10;
            number /= 10;
        }
        int sum = lastdigit+firstdigit;
        return sum;
    }
    public static int getEvenDigitSum(int number){
        if (number < 0)
            return -1;
        int sum=0;
        int digit=0;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if ((digit % 2) ==0)
                sum+=digit;
        }
        return sum;
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99)
            return false;
        int digit1 = 0;
        int digit2 = 0;
        int tempnumber2=number2;
        while (number1 > 0) {
            digit1 = number1 % 10;
            number1 /= 10;
            System.out.println(digit1);
            while (tempnumber2 > 0) {
                digit2 = tempnumber2 % 10;
                System.out.println(digit2);
                if (digit1 == digit2)
                    return true;
                tempnumber2 /= 10;
            }
            tempnumber2=number2;
        }
        return false;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000)
            return false;
        if (((num1 % 10) == (num2 % 10) ) || ((num1 % 10) == (num3 % 10 )) || ((num3 % 10) == (num2 % 10 )))
           return true;
        return false;
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10)
            return -1;
                int i=first-1;
        while(i>1){
           if ((first % i) == 0 && (second % i) == 0)
               return i;
        i--;
        }
        return -1;
     }
     public static void printFactors(int number){
        if (number < 1)
            System.out.println("Invalid Value");
        for(int i=1;i<=number;i++){
          if (number % i == 0)
              System.out.println(i);
        }
     }
    public static boolean isPerfectNumber(int number){
        if (number < 1)
            return false;
        int sum=0;
        int i=1;
        while (i < number){
        //for(int i=1;i<number;i++){
            if (number % i == 0)
               sum+=i;
            i++;
        }
        if (number == sum)
            return true;
        return false;
    }
    public static void numbersToWords(int number1) {
        int digit = 0;
        int number = reverse(number1);
        int number3=number;
        String digitstring = "";
        if (number < 1)
            System.out.println("Invalid Value");
        while (number > 0) {
            digit = number % 10;
            switch (digit) {
                case 0:
                    digitstring = "Zero";
                    break;
                case 1:
                    digitstring = "One";
                    break;
                case 2:
                    digitstring = "Two";
                    break;
                case 3:
                    digitstring = "Three";
                    break;
                case 4:
                    digitstring = "Four";
                    break;
                case 5:
                    digitstring = "Five";
                    break;
                case 6:
                    digitstring = "Six";
                    break;
                case 7:
                    digitstring = "Seven";
                    break;
                case 8:
                    digitstring = "Eight";
                    break;
                case 9:
                    digitstring = "Nine";
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            number /= 10;
            System.out.println(digitstring);
        }
        for (int i = getDigitCount(number3); i < getDigitCount(number1); i++) {
            digitstring="Zero";
            System.out.println(digitstring);
        }

    }
    public static int reverse(int number) {
        int digit = 0;
        int reversenum = 0;
        while (number != 0) {
            digit = number % 10;
            number/=10;
            reversenum=reversenum*10+digit;
        }
        return reversenum;
     }
     public static int getDigitCount(int number){
        if (number < 0)
            return -1;
        if (number ==0)
            return 1;
        int count=0;
        int digit = 0;
        while (number > 0) {
           digit = number % 10;
           number/=10;
           count++;
        }
        return count;
     }
}
