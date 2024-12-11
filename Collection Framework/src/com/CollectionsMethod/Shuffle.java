package com.CollectionsMethod;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
	// Include Duplicate and Not follow Insertion Order
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(99);
		al.add(19);
		al.add(23);
		al.add(77);
		al.add(12);
		al.add(19);
		al.add(63);
		al.add(53);
		al.add(12);
		al.add(99);
		Collections.shuffle(al);
		System.out.println(al);

	}

}
