package com.cg.constructor;

public class SingletonClass {

	int a,b;
	static SingletonClass instance;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if(instance == null)
			instance = new SingletonClass();
		return instance;
	}
	
	public static int addVal(int a,int b) {
		return a+b;
	}
}