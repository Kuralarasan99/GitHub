package com.strings;

public class StringReverse {

	public static void main(String[] args) {

//		String str = "Java Selenium"
//				Output 1 : Selenium Java
//				Output2:muineleS avaJ

		String str = "Java Selenium";
		String out1 = "";
		String out2 = "";
		String[] split = str.split(" ");
		String string = split[1];
		String string2 = split[0];
		out1 = string + " " + string2;
		System.out.println(out1);

		String[] split2 = out1.split(" ");
		for (int i = 0; i < split2.length; i++) {
			String string3 = split2[i];
			for (int j = string3.length() - 1; j >= 0; j--) {
				char charAt = string3.charAt(j);
				out2 = out2 + charAt;
			}
			out2 = out2 + " ";
		}
		System.out.println(out2);
	}

}
