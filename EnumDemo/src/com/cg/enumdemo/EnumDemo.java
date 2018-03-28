package com.cg.enumdemo;

enum Color{
	red,green,blue;
	static int a = 5;   //variable must be static
	static String value = "hello";

/*public static void main(String[] args) {
		
		enum Suits{
		 * cannot be defined inside a method
		}
		System.out.println(Color.a);
		System.out.println();
		
		}*/
	
}

public class EnumDemo {            
	enum Color{
		red,green,blue;
		static int a = 5;   //variable must be static
	}

	public static void main(String[] args) {
		
		/*enum Suits{
		 * cannot be defined inside a method
		}*/
		System.out.println(Color.a);
		System.out.println();
		
	}

}
