package com.cg.primitiveconversion;

public class OverloadingDemo {

	public void disp(int a) {
		System.out.println("Integer value");
	}
	
	public void disp(String b) {
		System.out.println("String value");
	}
	
	public static void main(String[] args) {

		OverloadingDemo demo = new OverloadingDemo();
		Integer a = null;
		demo.disp(null);

		demo.disp(a);

	}

}
