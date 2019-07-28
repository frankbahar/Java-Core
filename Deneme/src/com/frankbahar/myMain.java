package com.frankbahar;

import java.util.Scanner;

public class myMain {

	public static void main(String s[]) {
		/*
		 * int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}}; int sum = 0;
		 * for (int i = 0; i < 3; ++i) for (int j = 0; j < 3 ; ++j) sum = sum +
		 * array_variable[i][j]; System.out.print(sum / 5);
		 * 
		 * int x = 3; int y = ~ x; System.out.println("y: " + y); int z; z = x > y ? x :
		 * y;
		 */
		// System.out.print(z);
		// int x=y=z=20;
		int a, b, c, d;
		a = b = c = d = 20;
		a += b -= c *= d /= 20;
		System.out.println("denemme");
		System.out.println(a + " " + b + " " + c + " " + d);

	}
}