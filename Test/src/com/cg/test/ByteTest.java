package com.cg.test;

public class ByteTest {

	public static void main(String[] args) {

		byte a = 127;
		byte b = 127;
		Byte bite = new Byte((byte)b);
		System.out.println((byte)(a+b+2));
		
		System.out.println(bite instanceof Byte);
	}
}