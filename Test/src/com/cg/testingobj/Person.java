package com.cg.testingobj;

public class Person {

	int x;
	int y;
	Person p,left,right;
		
	public void something() {
		System.out.println(p);
	}
	
	public Person init(Person p) {
		if(p==null) {
			p = new Person();
			return p;
		}
		else {
			p.left = init(p.left);
		}
		return p;
	}
	
	public void initial(Person person) {
		init(person);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p=null;
		p1.initial(p);
		System.out.println(p);
		
		

	}

}
