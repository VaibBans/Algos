package com.cg.test;

import java.util.Scanner;

import com.cg.dao.BankFunctions;
import com.cg.dao.BankFunctionsImpl;
import com.cg.dto.BankDto;

public class BankTest {

	public static void main(String[] args) {
		
		BankDto b1 = new BankDto();
		BankFunctions bfunc = new BankFunctionsImpl();
		float amount,balance;
		b1.setName("A");
		b1.setPassword("a");
		b1.setBalance(10000.00F);
		balance = b1.getBalance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.nextLine();
		System.out.println("Enter the password");
		String password = sc.next();
		
		if(bfunc.checkUser(name, password)) {
			System.out.println("Welcome "+name);
			amount = 5000;
			System.out.println("Your balance is "+bfunc.checkBalance());
			balance = bfunc.deposit(amount,balance);
			System.out.println("Successfully "+amount+ " deposited");
			amount = 7000;
			balance = bfunc.withdraw(amount,balance);
			System.out.println("Successfully "+amount+ " withdrawn");
			System.out.println("Your balance is "+balance);
		}
			sc.close();
	}

}
