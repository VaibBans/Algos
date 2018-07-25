package com.cg.test;

public class ArrTest {

	public static void main(String[] args) {

		boolean bool = (returnVal(8)>0);
		System.out.println(bool);
	}
	
	public static int returnVal(int a) {
		int i,count=0;
		for(i=0;i<10;i++) {
			if(a>i)
				continue;
			else
			{
				count=0;
				break;
			}
		}		
		return count;
	}
}