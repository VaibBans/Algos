package com.cg.volatilekeyword;

public class BrokenBankAccount {

		  private int balance;

		  synchronized int getBalance() {
		    return balance;
		  }

		  synchronized void setBalance(int x) 
		    throws IllegalStateException {
		    balance = x;
		    if (balance < 0) {
		      throw new IllegalStateException("Negative Balance");
		    }
		  }

		  void deposit(int x) {
		    int b = getBalance();
		    setBalance(b + x);
		  }

		  void withdraw(int x) {
		    int b = getBalance();
		    setBalance(b - x);
		  }
		

	public static void main(String[] args) {
		BrokenBankAccount b = new BrokenBankAccount();
		
		b.setBalance(10);
		b.deposit(5);
		b.withdraw(5);
		
		System.out.println(b.getBalance());

	}

}
