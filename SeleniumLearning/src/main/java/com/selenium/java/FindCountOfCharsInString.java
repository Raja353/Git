package com.selenium.java;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfCharsInString {
   
	static void countofstring(String input)
	{
	  HashMap<Character, Integer> countstr = new HashMap<Character, Integer>();
	  char[] arr = input.toCharArray();
	  for (char c : arr)  
		  
		  
		{
		  if(countstr.containsKey(c))  
		  
		  {
			  countstr.put(c, countstr.get(c)+1);
		  }
		  else
		  {
			  countstr.put(c, 1);
		  }
		}
		  for(Map.Entry<Character, Integer> entry:countstr.entrySet())
		  {
			  System.out.println(entry.getKey()+" "+entry.getValue());
		  }
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "rajasekar";
		countofstring(str);
		

	}

}
