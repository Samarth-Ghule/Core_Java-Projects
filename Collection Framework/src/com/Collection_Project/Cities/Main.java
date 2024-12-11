package com.Travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main {

	TreeMap<String, HashMap<String, List<Cities>>> mapping() {
		Cities c1 = new Cities(1, "Pune", 411002);
		Cities c2 = new Cities(2, "Karvenagar", 411052);
		Cities c3 = new Cities(3, "Chinchwad", 411075);
		Cities c4 = new Cities(4, "Karad", 411465);
		Cities c5 = new Cities(5, "Miraj", 414587);
		Cities c6 = new Cities(6, "Akola", 416453);
		Cities c7 = new Cities(7, "Matheran", 417563);
		Cities c8 = new Cities(8, "Sawantwadi", 936465);
		Cities c9 = new Cities(9, "Wardha", 526476);
		Cities c10 = new Cities(10, "Chandigarh", 745638);
		Cities c11 = new Cities(11, "Bhopal", 856342);
		Cities c12 = new Cities(12, "Indore", 653757);
		Cities c13 = new Cities(13, "Lucknow", 574743);
		Cities c14 = new Cities(14, "Kanpur", 757848);
		Cities c15 = new Cities(15, "Agra", 192847);
		Cities c16 = new Cities(16, "Amritasar", 746473);
		Cities c17 = new Cities(17, "Mohali", 746355);
		Cities c18 = new Cities(18, "Banglore", 476375);
		Cities c19 = new Cities(19, "Belgaum", 987654);
		Cities c20 = new Cities(20, "Hubbali", 732684);

		List<Cities> listMH = new ArrayList<>();
		listMH.add(c1);
		listMH.add(c2);
		listMH.add(c3);
		listMH.add(c4);
		listMH.add(c5);
		listMH.add(c6);
		listMH.add(c7);
		listMH.add(c8);
		listMH.add(c9);

		List<Cities> listPN = new ArrayList<>();
		listPN.add(c10);
		listPN.add(c16);
		listPN.add(c17);

		List<Cities> listUP = new ArrayList<>();
		listUP.add(c13);
		listUP.add(c14);
		listUP.add(c15);

		List<Cities> listMP = new ArrayList<>();
		listMP.add(c11);
		listMP.add(c12);

		List<Cities> listKA = new ArrayList<>();
		listKA.add(c18);
		listKA.add(c19);
		listKA.add(c20);

		HashMap<String, List<Cities>> hm = new HashMap<>();
		hm.put("Maharashtra", listMH);
		hm.put("Punjab", listPN);
		hm.put("Uttar-Pradesh", listUP);
		hm.put("Madhya-Pradesh", listMP);
		hm.put("Karnataka", listKA);

		TreeMap<String, HashMap<String, List<Cities>>> tm = new TreeMap<>();
		tm.put("India", hm);

		return tm;
	}

}
