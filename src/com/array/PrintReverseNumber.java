package com.array;

public class PrintReverseNumber {

	public static void main(String[] args) {

		int a = 1234;
		int rev = 0;
		while (a > 0) {
			int b = a % 10;
			rev = (rev * 10) + b;
			a = a / 10;

		}
		System.out.println(rev);
	}

}
