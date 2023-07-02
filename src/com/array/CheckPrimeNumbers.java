package com.array;

public class CheckPrimeNumbers {

	public static void main(String[] args) {

		int a = 10;
		int count = 0;
		for (int i = 2; i < a / 2; i++) {
			if (a % 2 == 0) {
				count++;

			}

		}
		if (count == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

	}

}
