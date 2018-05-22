package com.cg.autoboxing;

public class ImmutableIntegers {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		System.out.println(increaseVar(a));
		System.out.println(increaseVar(b));
		
	}
	
	public static int increaseVar(int a) {
		a++;
		return a;
	}

}
