package com.array;

public class PrintAmstrongNumbers {

	public static void main(String[] args) {
		int a = 153;
		int temp = a;
		int amg = 0;
		while (a > 0) {
			int b = a % 10;
			amg = amg + (b * b * b);
			a = a / 10;

		}
		if (amg == temp) {
			System.out.println("It is a amstrong number");

		} else {
			System.out.println("It's not a amstrong number");
		}

	}

}
