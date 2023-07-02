package com.pattern;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapGetKey {
	public static void main(String[] args) {
		Map<String,String> m=new LinkedHashMap<String,String>();
		m.put("1", "Vignesh");
		Set<Entry<String, String>> entrySet = m.entrySet();
		for (Entry<String, String> x : entrySet) {
			String key = x.getKey();
			System.out.println(key);
			String value = x.getValue();
			System.out.println(value);
		}
		
	}

}
