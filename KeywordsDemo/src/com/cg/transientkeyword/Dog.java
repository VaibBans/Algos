package com.cg.transientkeyword;

public class Dog {
	
	String name;
	
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main( String[] args ){

	    Dog aDog = new Dog("Max");
	    
	    System.out.println("In main function Object ref value "+aDog);

	    aDog = foo(aDog);

	    
	    if (aDog.getName().equals("Max")) { //true

	        System.out.println( "Java passes by value." );

	    } else if (aDog.getName().equals("Fifi")) {

	        System.out.println( "Java passes by reference." );

	    }

	}

	public static Dog foo(Dog d) {

		System.out.println("In foo function Object ref value "+d);
	    d.getName().equals("Max"); // true

	    d = new Dog("Fifi");
	    System.out.println("In foo function new Object ref value "+d);

	    d.getName().equals("Fifi"); // true
	    return d;

	}
}
