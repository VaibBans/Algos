package com.cg.obj;

public class Obj {

	static int h=9;
	int i=1;
	
	public static void main(String[] args) {
		Obj o1 = new Obj();
		System.out.println(o1);
		System.out.println(o1.hashCode());
		
		int i;
		for(i=1;i<10;i++)
			System.out.println();
		
		
		System.out.println("Local valriable i "+i);
		
		System.out.println(o1.i);
		System.out.println(o1.p());
		System.out.println(h);
		
	}

	@Override
	public String toString() {
		return "Obj [getClass()=" + "Obj" + "]";
	}

	int p() {
		int h = 10;
		return this.h;
	}
	
}
