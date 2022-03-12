package com.selenium.java;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		System.out.println("Enter the String");
		String str;
		Scanner scn = new Scanner(System.in);
		str = scn.nextLine();
		System.out.println(counta); 
		char vowels;
		for(int i = 0;i<str.length();i++)
			
		{
			vowels = str.charAt(i);
			
		   switch(vowels)
			{
		   
		   case 'a':
		   counta++;
		   break;
		   case 'e':
		   counte++;
		   break;
		   case 'i':
		   counti++;
		   break;
		   case 'o':
		   counto++;
		   break;
		   case 'u':
		   countu++;
		   break;
		   }
		   
		   }
		
		System.out.println("a count = "+counta); 
		System.out.println("e count = "+counte); 
		System.out.println("i count = "+counti); 
		System.out.println("o count = "+counto); 
		System.out.println("u count = "+countu); 
	}
	


}
