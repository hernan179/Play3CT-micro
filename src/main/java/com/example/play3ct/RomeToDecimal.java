package com.example.play3ct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RomeToDecimal {
public static void main(String[] args) {
	System.out.println("Conver number...");
	
	String romeNumber = "CXX";
	System.out.println(converter(romeNumber));
	
	 useStream();
}

public static void useStream() {
	String input = "ilovejavatechie";
	
	System.out.println(Arrays.toString(input.split("")));
	
	Map<String,Long> map = Arrays.stream(input.split(""))
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	
}

public static int converter(String number) {
    Map map = new HashMap<String,Integer>();
    
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000); 
    
    if(number.length() < 2) {
      
    }
    
	return 0;
}


}
