package com.selenium.java;

public class StringReverse {
	static void stringreve(String str)
	{
		String[] split = str.split(" ");
		int size = split.length;
		System.out.println(size);
		for(int i = size-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sss = "This is Rajasekar";
		stringreve(sss);
	}

}
