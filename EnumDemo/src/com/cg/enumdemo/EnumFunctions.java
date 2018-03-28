package com.cg.enumdemo;

public class EnumFunctions {
	enum Color{
		red,green,blue,yellow,magenta,black,white,orange;
		static int a = 5;   //variable must be static
	}
	public static void main(String[] args) {
		
		for(Color col:Color.values()) {
			System.out.println(col+" "+col.ordinal());
		}
	}
}
