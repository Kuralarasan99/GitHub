package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoOfWords {

	public static void main(String[] args) {

		String s = "Java website using Java Program";
		String[] split = s.split(" ");

		Map<String, Integer> map = new LinkedHashMap<>();

		for (String s1 : split) {
			if (map.containsKey(s1)) {
				int in = map.get(s1);
				map.put(s1, in + 1);
			} else {
				map.put(s1, 1);
			}
		}

		System.out.println(map);

	}

}
