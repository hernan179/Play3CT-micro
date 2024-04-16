package com.example.play3ct;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Powerball {

	static Map<Integer, Integer> colum1 = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> colum2 = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> colum3 = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> colum4 = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> colum5 = new HashMap<Integer, Integer>();
	static Map<Integer, Integer> colum6 = new HashMap<Integer, Integer>();

	static Object obj = new Object();

	public static Map put(Map map, Integer key, int number) {
		map.put(new Integer(key), number);
		return map;
	}

	public static void main(String args[]) throws Exception {
		// System.out.println("Pronostico de hoy");

		FileReader fileReader = new FileReader(
				new File(System.getProperty("user.dir") + "/src/main/java/com/example/play3ct/powerball.txt"));

		BufferedReader br = new BufferedReader(fileReader);

		String data = "";
		String lastNumbers = "";
		int count = 0;
		while ((data = br.readLine()) != null) {
			
			String[] sorter = data.split(",");

			if (count == 0) {
				lastNumbers = "====== ";
				for (String s:sorter) {
					lastNumbers += getNum(new Integer(s));	
				}
				lastNumbers += "======";
			}
			
			
			// for (String sor : sorter) {
			putValidate(colum1, 1, new Integer(sorter[0]));
			putValidate(colum2, 2, new Integer(sorter[1]));
			putValidate(colum3, 3, new Integer(sorter[2]));
			putValidate(colum4, 4, new Integer(sorter[3]));
			putValidate(colum5, 5, new Integer(sorter[4]));
			putValidate(colum6, 6, new Integer(sorter[5]));
			count++;
		}

		Integer[] column1 = getMatrix(colum1);
		Integer[] column2 = getMatrix(colum2);
		Integer[] column3 = getMatrix(colum3);
		Integer[] column4 = getMatrix(colum4);
		Integer[] column5 = getMatrix(colum5);
		Integer[] column6 = getMatrix(colum6);

		System.out.println(
				"-----Pronostico poweball para " + new SimpleDateFormat("MM/dd/yyy").format(new Date()) + "----------");
		System.out.println(lastNumbers);
		for (int k = 0; k < column1.length; k++) {
			String response = 
					   getNum(column1[k]) 
					 + getNum(column2[k]) 
					 + getNum(column3[k]) 
					 + getNum(column4[k]) 
				     + getNum(column5[k]) 
					 + getNum(column6[k]);
			
			System.out.print(response);
			System.out.println("");
		}
	}

	public static void putValidate(Map<Integer, Integer> repeated, Integer keyx, Integer position) {

		synchronized (obj) {
			if (repeated.get((position)) != null) {
				int value = repeated.get(position);
				put(repeated, position, value + 1);
			} else {
				put(repeated, position, 1);
			}
		}
	}

	static String getNum(Integer num) {
			 return num.toString()+",";
	}

	private static Integer[] getMatrix(Map<Integer, Integer> colum1) {
		Map<Integer, Integer> mapOrder1 = colum1.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		Iterator<Integer> itr1 = mapOrder1.keySet().iterator();
		int countNumber = 10;

		Integer[] luck = new Integer[countNumber];
		int iter = 0;
		do {
			Integer key = itr1.next();
			String value = "" + key + "=" + mapOrder1.get(key) + "   ";
			luck[iter] = key;
			// System.out.println(value);
			iter++;
		} while (itr1.hasNext() && iter < countNumber);
		// System.out.println(luck[0]+" "+luck[1]+" "+luck[2]+" "+luck[3]+" "+luck[4]+"
		// "+luck[5]);
		return luck;
	}

}
