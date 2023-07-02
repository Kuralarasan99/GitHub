package com.strings;

public class StringConvertToUpperCase {

	public static void main(String[] args) {

		String s = "Abcd";
		String out = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'b') {
				String string = Character.toString(c);
				String upperCase = string.toUpperCase();
				out = out + upperCase;
			} else if (c != 'b') {
				out = out + c;
			}

		}
		System.out.println(out);

	}

}
