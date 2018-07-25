package com.cg.abstractclass;

public class IncreaseMarks extends StudentFunctions{

	@Override
	public int editRollNo(int marks) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void print() {
		System.out.println("Hello!! Not abstract but implementor");
	}

	@Override
	public int editMarks(int marks) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// method hiding
	public static void disp() {
		System.out.println("Hello in Sub Class");
	}
}