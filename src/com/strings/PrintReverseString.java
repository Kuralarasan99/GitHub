package com.strings;

public class PrintReverseString {

	public static void main(String[] args) {

		String a = "Jackie";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			char charAt = a.charAt(i);
			rev = rev + charAt;
		}
		System.out.println(rev);

	}

}
