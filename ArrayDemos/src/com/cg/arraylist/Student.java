package com.cg.arraylist;

public class Student {

		int rollNo;
		String name;
		int marks;
		long phoneNo;
		
		public Student(int rollNo, String name, int marks, long phoneNo) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.marks = marks;
			this.phoneNo = phoneNo;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", phoneNo=" + phoneNo + "]";
		}
		
		
	}