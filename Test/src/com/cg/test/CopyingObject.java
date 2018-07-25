package com.cg.test;

public class CopyingObject implements Cloneable{
	
	int num;
	String name;
	
	public CopyingObject(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "CopyingObject [num=" + num + ", name=" + name + "]";
	}

	public CopyingObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object aClone() throws CloneNotSupportedException {
		return this.clone();
	}
}