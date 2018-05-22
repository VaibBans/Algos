package com.cg.autoboxing;

public class ComparisonOfAutoboxed {

	public static void main(String[] args) {

		Integer x = -129,y = -129;
		
		Integer a = new Integer(455);
		Integer b = new Integer(455);
		
		int c = 321244 ,d=321244;
		
		Integer e = new Integer(10);
		Integer f = 10;
		
		if(x==y)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		if(a.valueOf(a)==b.valueOf(b))
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		if(c==d)
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		if(e==f)
			System.out.println("Same");
		else
			System.out.println("Not same");
	}

}
