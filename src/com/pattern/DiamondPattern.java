package com.pattern;

public class DiamondPattern {

	public static void main(String[] args) {

		for (int i = 1; i < 7; i++) { // line
			for (int j = i; j < 7; j++) { // column
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 7; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 7; j > i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
