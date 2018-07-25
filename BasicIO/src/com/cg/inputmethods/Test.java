package com.cg.inputmethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public void print() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) throws Exception{
		String str = "HELLO";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		System.out.println(Integer.parseInt(str1));
		
		
		char arr[] = str.toCharArray();
		
		int i=0,temp;
		while(i<arr.length) {
			arr[i] = (char)(arr[i]+32);
			System.out.println(arr[i]);
			i++;
		}
		
		System.out.println("******************************");
		
		for(i=0;i<arr.length;i++) {
			temp = arr[i];
			temp = temp-32;
			arr[i] = (char)temp;
			System.out.println(arr[i]);
		}
		
	}
}
