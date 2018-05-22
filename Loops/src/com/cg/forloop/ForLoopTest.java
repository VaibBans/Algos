package com.cg.forloop;

public class ForLoopTest {

	public static void main(String[] args) {

		int i;
		long j;
		double k;
		for(i=0,j=0L,k=0.0;i<1&&j<10&&k<10.0;i++,j++,k++) {
			System.out.println("Entered "+i);
		}
		System.out.println("Outside loop "+i);
	}

}
