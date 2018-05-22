package com.cg.var;

public class VarDemo {

	int a = 5;
	static int b = 10;
	public static void main(String[] args) {
			VarDemo demo1 = new VarDemo();
			VarDemo demo2 = new VarDemo();
			System.out.println(demo1.a);
			System.out.println(demo2.a=10);
			System.out.println(demo1.a);
		
			
			demo1.b = 20;
			System.out.println(b);
			demo2.b = 40;
			System.out.println(b);
			System.out.println(VarDemo.b);
	}

}
