package com.cg.enumdemo;

enum Colors{
	a("RED"),b("BLUE"),c("GREEN"), d("YELLOW");
	String val;
	private Colors(String val){
		this.val = val;
	}
	
	public String getColor() {
		return this.val;
	}
}

public class EnumColor {
	
	public static void main(String[] args) {
		System.out.println(Colors.d.getColor());
		System.out.println(Colors.d.name());
		
		Colors colors[] = Colors.values();
		for(Colors c:colors)
			System.out.println(c.name());
	}
}