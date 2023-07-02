package com.strings;

public class AddingNumInString {

	public static void main(String[] args) {

		String s = "abc1de4h5d5";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				int value = Character.getNumericValue(c);
				sum = sum + value;

			}

		}

		System.out.println(sum);

	}

}
