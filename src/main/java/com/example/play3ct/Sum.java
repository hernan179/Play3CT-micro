package com.example.play3ct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Sum {
	public static void main(String[] args) {
		
		System.out.println(3-3*6+2);
		
		
		
		HashMap m = new HashMap<>();
		System.out.println(m.hashCode());
		
		List<Integer> it = new ArrayList<Integer>();
		
		List myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().filter(a -> a % 3 == 0 || a % 5 == 0).collect(Collectors.toList());
		
		
		System.out.println(myList);
		
		
		
		for (Integer i = 1; i <= 10; i++) {
			it.add(i);

		}
		//System.out.println(it);
		for (int j = 0; j < it.size(); j++) {
			int aux =  it.get(j);
			
			//System.out.println("div  "+(it.get(j) % 5 == 0)+"   "+it.get(j));	
			if (it.get(j) % 5 == 0) {
				System.out.println("div 5 "+aux);
			}
			if (it.get(j) % 3 == 0) {
				System.out.println("div 3 "+aux);
			}
			
		}

	}
}
