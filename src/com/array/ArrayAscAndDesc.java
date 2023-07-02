package com.array;

public class ArrayAscAndDesc {

	public static void main(String[] args) {

		int[] a = { 10, 3, 15, 5, 12, 1, 13 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println("Maximum value in given Array:" + a[0]);
		System.out.println("Minimum value in given Array:" + a[a.length - 1]);

	}

}
