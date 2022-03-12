package com.selenium.java;

import java.util.ArrayList;
import java.util.List;

public class ReverseOneByOne {
	
  static void rvrseonebyone(String str)
  {
	  String [] countstr = str.split(" ");
	  int length = countstr.length;
	 // String finalstring = "";
	 // List<String> list = new ArrayList<String>();
	  for(int i =0;i<=length-1;i++)
	  {
		 		  
		  for(int j = countstr[i].length()-1;j>=0;j--)
		  {
			  
			  System.out.print(countstr[i].charAt(j));
		  }
		  
		  System.out.print(" ");
		  
	  }
  }

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		rvrseonebyone("This is Rajasekar");
		

	}

}
