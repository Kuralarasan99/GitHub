package com.strings;

public class SplitNumAndAlphabets {
	
	public static void main(String[] args) {
		
		String s = "ja1v3f4+5";
		String letter = "";
		String number = "";
		String Special="";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				letter = letter+c;
				
			} else if (Character.isDigit(c)) {
				number = number+c;
			} else {
				Special=Special+c;
			}
			
		}
		
		System.out.println(letter);
		System.out.println(number);
		System.out.println(Special);
		
	}

}
