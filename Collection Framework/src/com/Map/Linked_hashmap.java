package com.Map;

import java.util.LinkedHashMap;

public class Linked_hashmap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(1, "India");
		hm.put(27, "UK");
		hm.put(3, "pak");
		hm.put(47, "Nepal");
		hm.put(85, "USA");
		hm.put(3, "Canada");

		System.out.println(hm);
	}

}
