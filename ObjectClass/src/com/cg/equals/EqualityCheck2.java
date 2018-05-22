package com.cg.equals;

public class EqualityCheck2 {

	public static void main(String[] args) {

		int a = 1281;
		int b = 673545645;
		
		Integer c = new Integer(456445153);
		Integer d = new Integer(456445153);
		
		Integer e = new Integer(4);
		Integer f = new Integer(1281);
		
		if(a==b)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(c.equals(d))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(a==f)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		System.out.println(e);
		System.out.println(f);
	}

}
