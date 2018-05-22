package com.cg.bank;

public class BankApp {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(100.00);

		BankAccount ba3;
		
		BankAccount ba2 ;
		ba2 = ba1;
		ba3 = ba2;

		System.out.print("Before transactions, ");	
		ba2.display(); // display balance
		ba2.deposit(74.35); // make deposit
		ba2.withdraw(20.00); // make withdrawal
		System.out.print("After transactions, ");
		ba2.display();
		
		System.out.println("BA1 "+ba1);
		System.out.println("BA2 "+ba2);
		System.out.println("BA3 "+ba3);
		
		String a = "1";
		int x = Integer.parseInt(a);
		System.out.println(x);
				
	}

}
