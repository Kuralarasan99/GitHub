package com.strings;

public class NonRepeatString {

	public static void main(String[] args) {

		String s = "automation";
		char[] charArray = s.toCharArray();
		for (char a : charArray) {
			if (s.indexOf(a) == s.lastIndexOf(a)) {
				System.out.println(a);
			}

		}

	}

}
