package com.Map;

import java.util.HashMap;

public class Hash_map {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "India");
		hm.put(2, "UK");
		hm.put(3, "pak");
		hm.put(4, "Nepal");
		hm.put(5, "USA");
		hm.put(3, "Canada");

		System.out.println("Size:" + hm.size());
		System.out.println("Get Key:" + hm.get(3));
		System.out.println(hm);
	}

}
