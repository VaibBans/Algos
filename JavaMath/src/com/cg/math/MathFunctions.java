package com.cg.math;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MathFunctions {
	
	public static void main(String[] args) throws IOException {
		
		double d = 23.53;
		double dd = 2;
		int num = -748545;
		System.out.println("Ceil Function "+Math.ceil(d));
		System.out.println("Rint Function "+Math.rint(d));
		System.out.println("Floor Function "+Math.floor(d));
		System.out.println("Round function "+Math.round(d));
		System.out.println("Exponential Function "+Math.exp(dd));
		System.out.println("Logarithmic Function "+Math.log(Math.exp(1)));
		
		System.out.println(Math.abs(num));
		
		double angle = Math.PI/2;
		System.out.println(Math.tan(angle));
		
		System.out.println(Math.random());
		
		Integer i = new Integer(1);
		i=2;
		System.out.println(i);
		
		SimpleDateFormat frmt = new SimpleDateFormat("MM/dd/YYYY");
		String str = frmt.format(new Date());
		System.out.println(str);		
		
		char c = 'a';
		System.out.printf("%c ",c);
		
		System.out.println("\rHello\n\rall ");
		
		System.out.printf("Enter the input");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		Integer inte = isr.read();
		PrintStream ps = new PrintStream(System.out);
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("Hello.txt"));
		System.out.println("Through DataOutputStream");
		dos.writeInt(i);
		
		ps.print(inte);
		dos.close();
//	new BufferedOutputStream(
	}
	
}
