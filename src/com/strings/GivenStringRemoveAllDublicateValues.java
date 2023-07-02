package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GivenStringRemoveAllDublicateValues {

	public static void main(String[] args) {

		String s = "Java Programm in java language";
		String out = "";
		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (m.containsKey(c)) {
				Integer in = m.get(c);// a=1 m.get(a);
				m.put(c, in + 1);
			} else {
				m.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> x : entrySet) {
			Integer value = x.getValue();
			System.out.println(x);
			if (value == 1) {
				Character key = x.getKey();
				out = out + key;
			}

		}
		System.out.println(out);

	}

}
