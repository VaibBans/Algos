package com.cg.inheritance;

public class X {

	long a;
	public long covar(long a) {
		this.a = a;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Y extends X{
	
	int b;
	@Override
	public int covar(int b) {
		this.b = b;
		return b;
	}
}