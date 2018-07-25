package com.cg.dao;

import com.cg.dto.BankDto;

public class BankFunctionsImpl implements BankFunctions {

	BankDto b1 = new BankDto();
	float bal;
	@Override
	public float checkBalance() {

		return b1.getBalance();
	}

	@Override
	public float withdraw(float amount,float balance) {
		bal = balance;
		if(bal>amount)
			bal -= amount;
		else
			System.out.println("Not sufficient balance");
		return bal;
	}

	@Override
	public float deposit(float amount,float balance) {
		bal = balance;
		bal = bal+amount;
		return bal;
	}

	@Override
	public boolean checkUser(String name, String password) {
		if("A".equals(name)&&"a".equals(password))
		return true;
		return false;
	}

}
