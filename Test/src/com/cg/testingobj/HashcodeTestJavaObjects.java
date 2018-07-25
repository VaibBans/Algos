package com.cg.testingobj;

public class HashcodeTestJavaObjects {

	int x;
	public static void main(String[] args) {
		
		HashcodeTestJavaObjects o2;
		HashcodeTestJavaObjects o1 = new HashcodeTestJavaObjects();
		o1.x = 5;
		o2 = o1;
		System.out.println("hashcode of o2 "+o2);
		System.out.println(o1);
		o1 = new HashcodeTestJavaObjects();
		o1.x = 10;
		System.out.println(o1);
		System.out.println(o1.x);
		System.out.println(o2.x);

	}

}
