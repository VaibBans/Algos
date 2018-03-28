package com.cg.enumdemo;

public class EnumCustomizedValue {

	enum Fruits{
		APPLE("red"),BANANA("yellow"),GRAPES("green");
		
		String color;
		
		private Fruits(String color) {
			this.color = color;
		}
		
		private String getColor() {
			return this.color;
		}
	}
	public static void main(String[] args) {
		Fruits ffruits = Fruits.valueOf("APPLE");
		System.out.println(Fruits.APPLE+" "+ffruits.getColor());
	}
}