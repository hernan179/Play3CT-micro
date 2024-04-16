package com.example.play3ct;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoadFile {

	public static Map put(Map map, String key, int number) {
		map.put(new Integer(key), number);
		return map;
	}
	static Map<Integer, Integer> repeated = new HashMap<Integer, Integer>();
	
	public static void putValidate(Map<Integer, Integer> repeated, String key, Integer position) {

		if (repeated.get((position)) != null) {
			int value = repeated.get(position);
			put(repeated, position.toString(), value + 1);
		} else {
			put(repeated, position.toString(), 1);
		}

	}

	

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				new File(System.getProperty("user.dir") + "/src/main/java/com/example/play3ct/megaplay2223.txt"));

		BufferedReader reader = new BufferedReader(fr);
		String line = "";

		String first = "";
		String second = "";
		String thrid = "";
		String fourd = "";
		String five = "";

		List<String[]> register = new ArrayList<>();
		Integer i = 1;

		while ((line = reader.readLine()) != null) {
			String[] number = line.split("\\,");
			
			putValidate(repeated, i.toString(), new Integer(number[0]));
			putValidate(repeated, i.toString(), new Integer(number[1]));
			putValidate(repeated, i.toString(), new Integer(number[2]));
			putValidate(repeated, i.toString(), new Integer(number[3]));
			putValidate(repeated, i.toString(), new Integer(number[4]));
			i++;
		}
	
		
		Map<Integer, Integer> mapOrder1 = repeated.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(repeated);
		
		for (Map.Entry<Integer, Integer> entry : mapOrder1.entrySet()) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
			//number1[i] = entry.getKey();
			//i++;
		}
		

	}

	public static void mainXX(String[] args) throws Exception {
		FileReader fr = new FileReader(
				new File(System.getProperty("user.dir") + "/src/main/java/com/example/play3ct/lockyforlife.txt"));

		BufferedReader reader = new BufferedReader(fr);
		String line = "";

		String first = "";
		String second = "";
		String thrid = "";
		String fourd = "";
		String five = "";

		List<String[]> register = new ArrayList<>();
		while ((line = reader.readLine()) != null) {
			String[] number = line.split("\\,");
			register.add(number);
			first += number[0];
			second += number[1];
			thrid += number[2];
			fourd += number[3];
			five += number[4];
			// System.out.println(first+" "+line);
		}

		Map<Integer, Integer> mapColumn1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapColumn2 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapColumn3 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapColumn4 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapColumn5 = new HashMap<Integer, Integer>();

		// System.out.println("---: "+first);
		for (String[] s : register) {

			if (mapColumn1.get(new Integer(s[0])) != null) {
				int value = mapColumn1.get(new Integer(s[0]));
				put(mapColumn1, s[0], value + 1);
			} else {
				put(mapColumn1, s[0], 1);
			}

			if (mapColumn2.get(new Integer(s[1])) != null) {
				int value = mapColumn2.get(new Integer(s[1]));
				put(mapColumn2, s[1], value + 1);
			} else {
				put(mapColumn2, s[1], 1);
			}

			if (mapColumn3.get(new Integer(s[2])) != null) {
				int value = mapColumn3.get(new Integer(s[2]));
				put(mapColumn3, s[2], value + 1);
			} else {
				put(mapColumn3, s[2], 1);
			}

			if (mapColumn4.get(new Integer(s[3])) != null) {
				int value = mapColumn4.get(new Integer(s[3]));
				put(mapColumn4, s[3], value + 1);
			} else {
				put(mapColumn4, s[3], 1);
			}

			if (mapColumn5.get(new Integer(s[4])) != null) {
				int value = mapColumn5.get(new Integer(s[4]));
				put(mapColumn5, s[4], value + 1);
			} else {
				put(mapColumn5, s[4], 1);
			}

		}
		Map<Integer, Integer> mapOrder1 = mapColumn1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Map<Integer, Integer> mapOrder2 = mapColumn2.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Map<Integer, Integer> mapOrder3 = mapColumn3.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Map<Integer, Integer> mapOrder4 = mapColumn4.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Map<Integer, Integer> mapOrder5 = mapColumn5.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(mapOrder1);
		System.out.println(mapOrder2);
		System.out.println(mapOrder3);
		System.out.println(mapOrder4);
		System.out.println(mapOrder5);

	}

	public static void mainx(String[] args) throws Exception {
		FileReader fr = new FileReader(
				new File(System.getProperty("user.dir") + "/src/main/java/com/example/play3ct/play3.txt"));

		BufferedReader reader = new BufferedReader(fr);
		String line = "";

		String first = "";
		String second = "";
		String thrid = "";
		while ((line = reader.readLine()) != null) {
			String[] number = line.split("\\,");
			first += number[0];
			second += number[1];
			thrid += number[2];
		}

		Map<Integer, Integer> mapColumn1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapColumn2 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapColumn3 = new HashMap<Integer, Integer>();

		for (int i = 0; i <= first.length() - 1; i++) {

			if (mapColumn1.get(new Integer(first.substring(i, i + 1))) != null) {
				int value = mapColumn1.get(new Integer(first.substring(i, i + 1)));
				put(mapColumn1, first.substring(i, i + 1), value + 1);
			} else {
				put(mapColumn1, first.substring(i, i + 1), 1);
			}

			if (mapColumn2.get(new Integer(second.substring(i, i + 1))) != null) {
				int value = mapColumn2.get(new Integer(second.substring(i, i + 1)));
				put(mapColumn2, second.substring(i, i + 1), value + 1);
			} else {
				put(mapColumn2, second.substring(i, i + 1), 1);
			}

			if (mapColumn3.get(new Integer(thrid.substring(i, i + 1))) != null) {
				int value = mapColumn3.get(new Integer(thrid.substring(i, i + 1)));
				put(mapColumn3, thrid.substring(i, i + 1), value + 1);
			} else {
				put(mapColumn3, thrid.substring(i, i + 1), 1);
			}
		}

		Map<Integer, Integer> mapOrder1 = mapColumn1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Map<Integer, Integer> mapOrder2 = mapColumn2.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Map<Integer, Integer> mapOrder3 = mapColumn3.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(mapOrder1);
		System.out.println(mapOrder2);
		System.out.println(mapOrder3);

		Integer[] number1 = new Integer[10];
		Integer[] number2 = new Integer[10];
		Integer[] number3 = new Integer[10];
		int i = 0;
		int total = 3;
		for (Map.Entry<Integer, Integer> entry : mapOrder1.entrySet()) {
			// System.out.println(entry.getKey() + "/" + entry.getValue());
			number1[i] = entry.getKey();
			i++;
		}

		i = 0;
		for (Map.Entry<Integer, Integer> entry : mapOrder2.entrySet()) {
			// System.out.println(entry.getKey() + "/" + entry.getValue());
			number2[i] = entry.getKey();
			i++;
		}

		i = 0;
		for (Map.Entry<Integer, Integer> entry : mapOrder3.entrySet()) {
			// System.out.println(entry.getKey() + "/" + entry.getValue());
			number3[i] = entry.getKey();
			i++;
		}

		for (int ii = 0; ii < number1.length; ii++) {
			System.out.println(number1[ii] + " " + number2[ii] + " " + number3[ii]);
		}

	}

}
