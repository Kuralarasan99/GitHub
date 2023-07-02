package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoOfChar {

	public static void main(String[] args) {

		String s = "Durai";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int in = map.get(c);
				map.put(c, in + 1);
			} else {
				map.put(c, 1);
			}

		}

		System.out.println(map);

	}

}
