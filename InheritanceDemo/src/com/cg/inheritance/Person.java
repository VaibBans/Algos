package com.cg.inheritance;

public class Person {

	int a;
	public Person() {
		
		super();
		System.out.println("Parent Class "+hashCode());
}

	public static void main(String[] args) {
		Student stu = new Student();
		
		Student.KinderGartenStudent kgs = stu.new KinderGartenStudent();
		Student.InnerClass inner = new Student.InnerClass();
		inner.innerClass();

		
		kgs.hello();
		
		}
}

class Student extends Person{

	int b=10;

	void printVal() {
		System.out.println("Student Class");
	}
	
	public static class InnerClass{
		
		public void innerClass() {
			System.out.println("Static Inner Class");
		}
	}
	
	public class KinderGartenStudent {

	public KinderGartenStudent() {
			super();
			System.out.println("KG class "+hashCode());
			System.out.println("Super Class "+super.hashCode());
		}
	
	Student student = new Student();
	
		public void hello() {
			System.out.println("B "+b);
			student.printVal();
		}
		
	}

	public Student() {
		super();
		System.out.println("Student Class "+super.hashCode());
		System.out.println("Student Class "+hashCode());
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
	
}
