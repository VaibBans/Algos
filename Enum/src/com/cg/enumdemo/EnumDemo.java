package com.cg.enumdemo;

enum Color{
	
	a,b("blue"),r("red"),g("green");
	String val ;
	Color(String val){
		this.val = val;
	}
	Color(){
		
	}
	public static void setColor() {
		System.out.println("Color Enum");
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		EnumColor color ;
		for(Color c: Color.values()) 
		System.out.println(c.val);
			
		Color.setColor();
	}
}