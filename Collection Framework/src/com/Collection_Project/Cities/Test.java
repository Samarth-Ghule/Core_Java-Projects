package com.Travel;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Test {
	public void unMapping() {
		Main m = new Main();
		TreeMap<String, HashMap<String, List<Cities>>> listCities = m.mapping();

		for (String key : listCities.keySet()) {
			HashMap<String, List<Cities>> k1 = listCities.get(key);

			for (String key2 : k1.keySet()) {
				List<Cities> li = k1.get(key2);

				for (Cities cities : li) {
					System.out.println(cities.getName());
				}
			}
		}
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.unMapping();

	}

}
