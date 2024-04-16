package com.example.play3ct.tuil;


//import java.util.Arrays;
import java.util.*;

public class NumberPrime {
  public static void main(String[] args) {
	  System.out.println("Get number prime");
	  int numberPrime = 17;
	  int count = 0;
	  for(int i=1; i<=numberPrime;i++) {
		  
		  if(numberPrime % i == 0) {
			  count++;
		  }
	  }
	  System.out.println("count number is "+(count > 2 ? false:true));
	  
	  
	  List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
	   list.forEach(name -> System.out.println(name));
	   System.out.println("-------------------------------");
	   list.forEach(System.out::println);
	   
	   
	   Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));

	   uniqueNames.forEach(System.out::println);
	  
	  
	  
  }
}
