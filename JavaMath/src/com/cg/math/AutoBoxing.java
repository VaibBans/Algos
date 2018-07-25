package com.cg.math;

public class AutoBoxing {

	final static private int BUFFER_SIZE = 1<<16;	
	public static void main(String[] args) {

		Integer a = new Integer(10);
		
		int num = a;
		System.out.println(num);
		System.out.println("Buffer Size "+BUFFER_SIZE);
		
	}

}
