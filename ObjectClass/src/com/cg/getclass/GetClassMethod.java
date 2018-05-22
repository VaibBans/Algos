package com.cg.getclass;

public class GetClassMethod {

	public static void main(String[] args) {
		
		GetClassMethod m1 = new GetClassMethod();
		System.out.println(m1.getClass().getName());
		
		Integer a = new Integer(10);
		System.out.println(a+22);
	}
}