package com.cg.arrayrotation;

public class JugglingAlgorithm {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8};
		int i,gcd,num=4,temp[] = new int[num];
				
		gcd = gcdCalc(arr, num);	
		
		for(i=0;i<num;i++) {
			temp[i] = arr[i];
		}	
		
		if(gcd==1)
			oneGcd(arr, num);
		else
			notSingleGcd(arr, num);
		
		for(i=0;i<num;i++)
		{
			arr[arr.length-num+i] = temp[i];
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int gcdCalc(int arr[], int num) {
		int i,num1=arr.length,num2=num,gcd=1;
		for(i=1;i<num1+num2;i++) {
			if(num1%i==0&&num2%i==0)
				gcd=i;
		}
		return gcd;
	}
	
	public static void oneGcd(int arr[],int num) {
		int gcd = gcdCalc(arr, num),i,j;
		for(i=0;i<num;i++) {
			for(j=0;j<arr.length;j++) {
				if(j==0||(j%gcd==0&&j>=gcd&&i+j+gcd<=arr.length-1))
					arr[j] = arr[j+gcd];
			}
		}
	}
	
	public static void notSingleGcd(int arr[],int num) {
		int gcd = gcdCalc(arr, num),i,j;
		for(i=0;i<num;i++) {
			for(j=0;j<arr.length;j++) {
				if(j==0||(j%gcd==0&&j>=gcd&&i+j+gcd<=arr.length-1))
					arr[i+j] = arr[i+j+gcd];
			}
		}
	}
}