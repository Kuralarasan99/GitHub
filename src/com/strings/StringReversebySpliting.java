package com.strings;

public class StringReversebySpliting {

	public static void main(String[] args) {

		String s = "Java Programm";
		String out = "";
		String[] split = s.split(" ");

		for (int i = 0; i < split.length; i++) {
			String s2 = split[i];
			for (int j = s2.length() - 1; j >= 0; j--) {
				char charAt = s2.charAt(j);
				out = out + charAt;
			}
			out = out + " ";
		}
		System.out.println(out);

	}

}
