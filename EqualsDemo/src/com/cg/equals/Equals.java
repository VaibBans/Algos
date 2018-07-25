package com.cg.equals;

public class Equals {

	int a;
	int b;
	
	public Equals() {
	super();	
	}
public Equals(int a,int b) {
		this.a = a;
		this.b = b;
	}

public boolean equals(Equals e1, Equals e2) {
	return e1.a==e2.a&&e1.b==e2.b;
}
}
