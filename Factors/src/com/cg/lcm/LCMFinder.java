package com.cg.lcm;

public class LCMFinder {

	public static void main(String[] args) {

		int num1=4,num2=6;
		int lcm = lcm(num1, num2);
		System.out.println("lcm "+lcm);
	}

	public static int lcm(int num1,int num2) {
		int lcm = num1;
		while(true) {
			if(lcm%num1==0&&lcm%num2==0)
			{
//				System.out.println();
				break;
			}
			lcm++;
		}
		return lcm;
	}
	
	public static int lcmByHcf(int num1,int num2) {
		
		int i,hcf=1;
		for(i=1;i<num1+num2;i++) {
			if(num1%i==0&&num2%i==0)
				hcf = i;
		}
		return num1*num2/hcf;
	}
}