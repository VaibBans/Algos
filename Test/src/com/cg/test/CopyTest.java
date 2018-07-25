package com.cg.test;

public class CopyTest implements Cloneable{

	public static void main(String[] args) throws Exception {

		CopyingObject obj1 = new CopyingObject(1, "A");
		CopyingObject obj2 = (CopyingObject)obj1.aClone();
		
		System.out.println(obj2.name+obj2.num);
		
		System.out.println("Changing the value");
		
		obj2.name = "B";
		obj2.num = 2;
		
		System.out.println("Printing Clone object "+obj2.name+obj2.num);
		System.out.println("Printing Original object "+obj1.name+obj1.num);
	}
}