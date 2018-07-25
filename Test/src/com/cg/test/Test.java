package com.cg.test;

public class Test {

	public static void main(String[] args) {
		final int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 10, 20, 30, 40, 50 };
		arr2 = arr1;
		int value = (int)(Math.pow(2, 32));
		int va = 2147483647;
		System.out.println("Value "+value);
		System.out.println("Va "+va);
		for (int i = 0; i < arr2.length; i++)
			System.out.println();

		int l = 1;
		short a = 2;
		double res = a + l;
		float x = 1.23548784543554897897854545645345348645347845415418453415456535454845641541564145641864864864648666F;
		System.out.printf("%.101f", x);
		float xx = 1.123456789123f;
		float xxx = (float)(100000*Math.pow(2,32));
		System.out.println("\n"+xx);
		System.out.println("XXX "+xxx);
		
		char ch = 'A';
		ch = (char)l;   //explicit type casting

		byte bite = 80;
		byte bte = (byte)(bite*3);
		
		System.out.println(bte);
		float f = (float)10.0/(float)3.0;
		System.out.printf("%f",f);
	}
	}
