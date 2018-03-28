package com.cg.enumdemo;

public class EnumConstructor {

	enum Color{
		red,green;
		static int a = 5;
		private Color() {				//constructor of enum cannot be public or protected
			System.out.println(this.toString());
		}
	}
	Color color;
	public EnumConstructor(Color color) {
		this.color = color;
	}
	
	public static void main(String[] args) {
		String col = "red";
		System.out.println(Color.a);
	}

}
