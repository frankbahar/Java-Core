package com.frankbahar;

public class Main {

    public static void main(String[] args) {
	    int count=1;
	    while (count != 6){
	        System.out.println("count value is "+ count);
	        count++;
         }
	    count=1;
	    do {
			System.out.println("count value is "+ count);
			count++;
		} while (count !=6);
	    int number =4;
	    int finish=20;
	    count=0;
	    while (number <= finish) {
			number++;
			if (!isEven(number)){
				continue;
			}
			count++;
	    	System.out.println("Even number " + number);
	    	if (count ==5)
	    		break;;
		}
	    System.out.println("Total even number is " + count );
    }
    public static boolean isEven(int number) {
    	if ((number % 2) == 0)
    		return true;
    	return false;
	}
	public static int sumDigits(int number){
    	if (number < 10)
    		return -1;
    	while (for
	}
}
