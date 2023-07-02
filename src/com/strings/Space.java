package com.strings;

public class Space {

	public static void main(String[] args) {

		String s = "my name is ";
		int space = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				space++;
			}

		}

		System.out.println(space);

	}

}
