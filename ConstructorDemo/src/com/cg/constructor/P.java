package com.cg.constructor;

import java.sql.SQLException;

public class P {

	int a;
	
	public P() {
		
	}
	
	public P(int a) {
		this.a = a;
	}
	
	public void disp() throws SQLException{
		System.out.println("Hello in Base Class");
	}
}
