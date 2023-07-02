package com.strings;

public class SeperateCharAndNumInString {

	public static void main(String[] args) {

		String a = "fsdhghsdjkfgh437593875klsfldfg";
		String replaceAll2 = a.replaceAll("[0-9]", "");
		String replaceAll = a.replaceAll("[^0-9]", "");
		System.out.println(replaceAll2);
		System.out.println(replaceAll);

	}

}
