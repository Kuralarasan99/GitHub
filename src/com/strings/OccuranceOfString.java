package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfString {

	public static void main(String[] args) {

		String s = "java";
		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (m.containsKey(c)) {
				Integer in = m.get(c);
				m.put(c, in + 1);

			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);

	}

}
