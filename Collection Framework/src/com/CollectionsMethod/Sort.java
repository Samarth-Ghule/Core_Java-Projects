package com.CollectionsMethod;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	// Duplicate And Sorting
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
		al.add(63);
		Collections.sort(al);
		System.out.println(al);
		
		
	}
}
