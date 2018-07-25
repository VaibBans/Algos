package com.cg.test;

public class StringToInteger {

	public static void main(String[] args) {
		String str1 = "Hello ";
		Integer a = new Integer(null);
		
		String str2 = String.valueOf(a);
		String str3 = str1+a;
		
		System.out.println(str3+str2.length());
	}

}
