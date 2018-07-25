package com.cg.constructor;

public class MainSingletonClass {

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();

		s1.a = 1;
		s1.b = 2;
		
	    s2.a = 3;
	    s2.b = 4;
	    
	    System.out.println(s1.a);
	    System.out.println(s1.b);
	    
	    System.out.println("Addition "+SingletonClass.addVal(s1.a, s1.b));
	}

}
