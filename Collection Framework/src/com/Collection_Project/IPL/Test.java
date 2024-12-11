package com.IPL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Test {
	void m1() {
		Player p1 = new Player(1, 45, "Rohit", "India", "Bat");
		Player p2 = new Player(2, 7, "Dhoni", "USA", "Keeper");
		Player p3 = new Player(3, 18, "Virat", "Pak", "Ball");
		Player p4 = new Player(4, 8, "Jadeja", "Nepal", "Bat");
		Player p5 = new Player(5, 99, "Dube", "afk", "Ball");
		Player p6 = new Player(6, 23, "Gill", "India", "Bat");
		Player p7 = new Player(7, 23, "Sam", "Eng", "Ball");
		Player p8 = new Player(8, 111, "Roy", "Chaina", "Bat");
		Player p9 = new Player(9, 88, "Watson", "AUS", "Keeper");
		Player p10 = new Player(10, 99, "Chris", "UAS", "Bat");

		List<Player> listofPlayerCSK = new ArrayList<Player>();
		listofPlayerCSK.add(p1);
		listofPlayerCSK.add(p2);
		listofPlayerCSK.add(p3);
		listofPlayerCSK.add(p4);

		List<Player> listofPlayerRCB = new ArrayList<Player>();
		listofPlayerRCB.add(p5);
		listofPlayerRCB.add(p6);
		listofPlayerRCB.add(p7);

		List<Player> listofPlayerMI = new ArrayList<Player>();
		listofPlayerMI.add(p8);
		listofPlayerMI.add(p9);
		listofPlayerMI.add(p10);

		HashMap<String, List<Player>> hm = new HashMap<String, List<Player>>();
		hm.put("CSK", listofPlayerCSK);
		hm.put("RCB", listofPlayerRCB);
		hm.put("MI", listofPlayerMI);
		System.out.println(hm);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		TreeMap<String, HashMap<String, List<Player>>> tm = new TreeMap<String, HashMap<String, List<Player>>>();
		tm.put("IPL2025", hm);
		System.out.println(tm);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");

		TreeMap<String, TreeMap<String, HashMap<String, List<Player>>>> map = new TreeMap<String, TreeMap<String, HashMap<String, List<Player>>>>();
		map.put("BCCI", tm);

		System.out.println(map);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();

	}

}
