package com.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {

		String s = "java java java programe";
		String[] split = s.split("");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String s1 : split) {
			if (map.containsKey(s1)) {
				Integer integer = map.get(s1);
				map.put(s1, integer + 1);

			} else {
				map.put(s1, 1);
			}

		}
		System.out.println(map);

	}

}
