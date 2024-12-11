package com.ListAndSettMethods;

import java.util.TreeSet;

public class RemoveAndRemoveAll{
	public static void main(String[] args) {
		TreeSet<Integer> al = new TreeSet<Integer>();
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
		
//		al.remove(77);
		al.removeAll(al);
		
		System.out.println(al);

	}

}
