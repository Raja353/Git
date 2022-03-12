package com.selenium.java;

public class RemoveSpecialChars {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Raja$$!Sekar&&ww*";
		
		String strnew = str.replaceAll("[$!&*]", " ");
		System.out.println(strnew);
	}

}
