package com.cg.math;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class ObjStr implements Serializable{
	
	int a = 10;
	public ObjStr(int a) {
		this.a  = a;
	}
	
	public ObjStr() {
		super();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjStr obj = new ObjStr(10);
		
		ObjectOutputStream oos = new ObjectOutputStream(System.out);
		ObjectInputStream ois = new ObjectInputStream(System.in);
		
		Object ob = new Object();
		
		oos.writeObject(ob);
		oos.writeObject(ob);
		
		Object ob1 = ois.readObject();
		Object ob2 = ois.readObject();
		
		oos.close();
	}
}
