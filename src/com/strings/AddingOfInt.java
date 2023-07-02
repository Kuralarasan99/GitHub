package com.strings;

public class AddingOfInt {
	public static void main(String[] args) {
		
		String s = "ab22f4d66r5";
		String temp = "0";
		
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				temp = temp+c;
			}else {
				sum = sum + Integer.parseInt(temp);
				temp="0";
			}
			
		}
		sum = sum + Integer.parseInt(temp);
		System.out.println(sum);		
		
	}

}
