package com.strings;

public class GivenStringFindOutTheSpaceCount {

	public static void main(String[] args) {

		String s = "Vi g n e sh g go d";
		int count = 0;
		String let = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				count = count + 1;
			}
			if (c != ' ') {
				let = let + c;
			}
		}
		System.out.println(count);
		System.out.println(let);

	}

}
