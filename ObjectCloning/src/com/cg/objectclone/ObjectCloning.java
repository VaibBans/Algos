package com.cg.objectclone;

public class ObjectCloning implements Cloneable{

	String name;
	int rollNo;
	
	public ObjectCloning() {
		super();
	}

	public ObjectCloning(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
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

	public Object aclone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		ObjectCloning obj1 = new ObjectCloning();
		
		try {
			ObjectCloning obj2 = (ObjectCloning) obj1.aclone();
			obj1.setName("ABC");
			obj1.setRollNo(123);
			obj2 = (ObjectCloning)obj1.aclone();
			System.out.println(obj1.name+" "+obj1.rollNo);
			System.out.println(obj2.name+" "+obj2.rollNo);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}