package com.strings;

public class GivenStringSplitCharacterAndInteger {

	public static void main(String[] args) {

		String s = "Java145fd1&**54";
		String leter = "";
		String Number = "";
		String special = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				leter = leter + c;
			} else if (Character.isDigit(c)) {
				Number = Number + c;
			} else {
				special = special + c;
			}

		}
		System.out.println(leter);
		System.out.println(Number);
		System.out.println(special);
	}

}
