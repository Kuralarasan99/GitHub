package com.strings;

public class ReversingEachWordInString {

	public static void main(String[] args) {

		String s = "Welcome to pattaya";
		String v = "";

		String[] split = s.split(" ");
		for (String string : split) {
			String w = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				char charAt = string.charAt(i);
				w = w + charAt;
			}
			v = v + w + " ";

		}
		System.out.println(v);

	}

}
