package com.example.play3ct;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

class A{}

public class PalindromeTest {
	
  public static void main(String args[]) {

	
	
	  
	String words = "rACEcar";
	String wordsCompare = "";
	
	int lngth = words.length();
	System.out.println("Is palindrome? "+lngth);
	int j = lngth - 1;
	boolean isPalindrome = true;
	for(int i = 0; i < lngth ; i++,j--) {
		 System.out.println(words.charAt(i)+"  "+words.charAt(lngth - i -1));	  
		if(!(words.substring(i,i + 1 ).toUpperCase().equals(words.substring(j,lngth-i).toUpperCase()))) {
		   isPalindrome = false;
	   }
	}
	  System.out.println(words+ " "+wordsCompare+"  "+(isPalindrome));	  
  }
}
