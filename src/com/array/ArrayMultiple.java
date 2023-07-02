package com.array;

public class ArrayMultiple {

	public static void main(String[] args) {

		int[] a = { -100, -200, 50, 60, 200, 100 };

		int b = 0;
		for (int i = 0; i <= 2; i++) {
			if (b == 0) {
				b = a[i];
			} else {
				b = b * a[i];
			}

		}
		System.out.println(b);
	}

}
