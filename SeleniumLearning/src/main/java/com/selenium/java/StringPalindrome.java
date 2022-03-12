package com.selenium.java;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b="";
      Scanner va =  new Scanner(System.in);
      System.out.println("Enter the value which needs to be checked");
      a = va.nextLine();
      
      System.out.println(a);
      int length = a.length();
      for(int i = length-1;i>=0;i--)
    	  
    	  b = b+a.charAt(i);
      System.out.println(b);
      
      if(a.equals(b))
      {
    	  System.out.println("The given string is palindrome");
    	  
      }
      
      else
      {
    	  System.out.println("The given string is not palindrome");
      }
      
	}
	

}
