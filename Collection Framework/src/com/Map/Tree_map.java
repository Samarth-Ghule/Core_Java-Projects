package com.Map;

import java.util.TreeMap;

public class Tree_map {
	public static void main(String[] args) {
		// Sorting 
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(1, "India");
		hm.put(23, "UK");
		hm.put(3, "pak");
		hm.put(47, "Nepal");
		hm.put(85, "USA");
		hm.put(3, "Canada");

		System.out.println(hm );
	}

}
