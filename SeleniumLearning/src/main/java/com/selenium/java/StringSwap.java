package com.selenium.java;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str1="Hello";
    String str2="World";
    
    str1 = str1+str2;
    // str1=HelloWorld
    str2 = str1.substring(0, str1.length() - str2.length());
    //str2 = Hello
    str1 = str1.substring(str2.length());
    
    System.out.print(str1+" "+str2);
	}

}
