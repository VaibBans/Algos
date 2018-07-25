package com.cg.dao;

public interface BankFunctions {

	public boolean checkUser(String name,String password);
	public float checkBalance();
	public float withdraw(float amount,float balance);
	public float deposit(float amount,float balance);
}
