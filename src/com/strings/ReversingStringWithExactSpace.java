package com.strings;

public class ReversingStringWithExactSpace {

	public static void main(String[] args) {

		String s = "i love india";
		char[] charArray = s.toCharArray();
		char[] output = new char[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				output[i] = ' ';
			}
		}

		int j = output.length - 1;
		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] != ' ') {
				if (output[j] == ' ') {
					j--;
				}
				output[j] = charArray[i];
				j--;
			}
		}
		String valueOf = String.valueOf(output);
		System.out.println(valueOf);

	}

}
