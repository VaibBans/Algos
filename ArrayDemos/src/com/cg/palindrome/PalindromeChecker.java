package com.cg.palindrome;

public class PalindromeChecker {

	public static void main(String[] args) {

		String str = "RADAR";
		char arr[] = new char[str.length()];
		int i,count=0;
		
		for(i=0;i<str.length();i++) {
			 arr[i] = str.charAt(i);
		}
		
		for(i=0;i<arr.length/2;i++) {
			if(arr[i] == arr[arr.length-i-1]) 
				count = 1;
		}
		
		if(count==1)
			System.out.println("Palindrome");
		else if(count==0)
			System.out.println("Not Palindrome");
	}
}