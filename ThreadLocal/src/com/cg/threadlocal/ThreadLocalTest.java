package com.cg.threadlocal;

public class ThreadLocalTest {

	public static void main(String[] args) {
		ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
		threadLocalValue.set(1);
		int result = threadLocalValue.get();
		System.out.println(result);		
		
		ThreadLocal<Integer> threadLocalValue1 = ThreadLocal.withInitial(()->1);
//		System.out.println("New Value is "+threadLocalValue1.toString());
	}
}