package com.cg.arithmetic;

public class ShiftOperator {

	public static void main(String[] args) {
		 int a = 0b10001001;
	     int b = 0b10001001;
     

	        // left shift operator
	        // 0000 0101<<2 =0001 0100(20)
	        // similar to 5*(2^2)
	        System.out.println("a<<2 = " + (a << 4));
	        System.out.println(a);
	 
	        // right shift operator
	        // 0000 0101 >> 2 =0000 0001(1)
	        // similar to 5/(2^2)
	        System.out.println("b>>2 = " + (b >> 2));
	        System.out.println(b); 
	        
	        // unsigned right shift operator
	        System.out.println("b>>>2 = "+ (b >>> 2));
	 
	}

}
  // 2147483648