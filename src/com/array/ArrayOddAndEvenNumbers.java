package com.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayOddAndEvenNumbers {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> add = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				add.add(a[i]);
			} else {
				even.add(a[i]);
			}
		}
		System.out.println("odd  no :" + add);
		System.out.println("even no :" + even);

	}

}
