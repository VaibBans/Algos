package com.cg.testingobj;

public class ObjRefTest {

	public ObjRefTest init() {
		return new ObjRefTest();
	}
	
	public static void main(String[] args) {
		
		ObjRefTest o1 = new ObjRefTest();
		System.out.println(o1);
		
		o1 = o1.init();
		System.out.println(o1);
	}

}
