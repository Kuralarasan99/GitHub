package com.array;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 12, 12, 3, 4, 5, 5, 5, 6, 7, 8 };
		int len = a.length;
		int temp[] = new int[a.length];
		int b = 0;

		for (int i = 0; i < len - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[b++] = a[i];
			}
		}
		temp[b++] = a[a.length - 1];
		for (int i = 0; i < b; i++) {
			System.out.println(temp[i]);
		}
	}

}
