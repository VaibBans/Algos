package com.cg.userdefinedarray;

public class Student {

	String name;
	int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student Name: "+name+" Student RollNo: "+rollNo;
	}
}