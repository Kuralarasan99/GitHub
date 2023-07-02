package com.strings;

public class MathematicalOperations {
	public static void main(String[] args) {

		String s = "5-4+3*2/2";
		char[] c = s.toCharArray();
		int numericValue = Character.getNumericValue(c[0]);

		for (int i = 0; i < c.length; i++) {
			int num = c[i];

			switch (num) {
			case '+':
				int add = Character.getNumericValue(c[i + 1]);
				numericValue = numericValue + add;
				break;

			case '-':
				int sub = Character.getNumericValue(c[i + 1]);
				numericValue = numericValue - sub;
				break;

			case '*':
				int multiply = Character.getNumericValue(c[i + 1]);
				numericValue = numericValue * multiply;
				break;

			case '/':
				int div = Character.getNumericValue(c[i + 1]);
				numericValue = numericValue / div;
				break;

			default:
				break;
			}
		}
		System.out.println(numericValue);

	}

}
