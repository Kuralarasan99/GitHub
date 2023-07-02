package com.strings;

public class SplitingString {

	public static void main(String[] args) {

		String s = "Java 1#Programm !234.c 5@";
		String upperCase = "";
		String lowerCase = "";
		String number = "";
		String special = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCase = upperCase + c;
			} else if (Character.isLowerCase(c)) {
				lowerCase = lowerCase + c;
			} else if (Character.isDigit(c)) {
				number = number + c;
			} else {
				special = special + c;
			}

		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(number);
		System.out.println(special);

	}

}
