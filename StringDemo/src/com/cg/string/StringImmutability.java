package com.cg.string;

public class StringImmutability {

	public static void main(String[] args) {

		String a = "a";
		a.concat("b");
		a = "abc";
		System.out.println(a);
		System.out.println("Hello");
		System.out.println("Above sys err");
		System.out.println("Not following order");
		System.out.println("Just Checking the precedence");
		
		
		String b = "a";
		System.err.println(a==b);
	}

}
