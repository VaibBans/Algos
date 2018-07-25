package com.cg.test;

public class InnerClassTest {

	
	class Class{
		int a = 1;
	}
	
	public static void main(String[] args) {
		
		InnerClassTest c = new InnerClassTest();
		InnerClassTest.Class cl = c.new Class();
		System.out.println(cl.a);
	}
}
