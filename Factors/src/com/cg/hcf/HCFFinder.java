package com.cg.hcf;

public class HCFFinder {

	public static void main(String[] args) {

		int num1=2,num2=5,gcd=1,i,maxDiv1[]=new int[num1],maxDiv2[] = new int[num2];
		for(i=1;i<=num1;i++) {
			if(num1%i==0)
				maxDiv1[i-1]=i;
		}
		
		for(i=1;i<num2;i++) {
			if(num2%i==0)
				maxDiv2[i-1]=i;
		}
		
		for(i=0;i<num1+num2;i++) {
			if(num1<num2&&i<num1) {
				if(maxDiv1[i]==maxDiv2[i]&&maxDiv1[i]!=0) {
					gcd = maxDiv1[i];
				}
			}
			else if(num2<num1&&i<num2){
					if((maxDiv1[i]==maxDiv2[i])&&maxDiv1[i]!=0) {
						gcd = maxDiv1[i];
					}
				}
			else if(num1==num2)
				gcd = num1;
			}
		System.out.println("Highest Common Factor is "+gcd);
		}
	}