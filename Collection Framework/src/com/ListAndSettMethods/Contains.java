package com.ListAndSettMethods;

import java.util.ArrayList;

public class Contains {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(80);
		al.add(19);
		al.add(23);
		al.add(77);
		al.add(12);
		al.add(19);
		al.add(63);
		al.add(53);
		al.add(49);
		al.add(23);

		System.out.println(al.contains(77));
		System.out.println(al.contains(78));

	}

}
