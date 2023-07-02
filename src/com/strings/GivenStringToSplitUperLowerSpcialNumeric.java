package com.strings;

public class GivenStringToSplitUperLowerSpcialNumeric {

	public static void main(String[] args) {

		String s = "Vgd#454$%^131s1svzvsdgjebDFG(()";
		String lowercase = "";
		String number = "";
		String Specical = "";
		String upperCase = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				upperCase = upperCase + c;
			} else if (Character.isLowerCase(c)) {
				lowercase = lowercase + c;
			} else if (Character.isDigit(c)) {
				number = number + c;
			} else {
				Specical = Specical + c;
			}
		}
		System.out.println(lowercase);
		System.out.println(number);
		System.out.println(Specical);
		System.out.println(upperCase);

	}

}
