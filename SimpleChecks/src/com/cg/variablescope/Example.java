package com.cg.variablescope;

public class Example {
		int i[] = {0};
		public static void main(String args[]) 
		{
		      int i[] = {1};
		      change_i(i);
		      System.out.println(i[0]);
		}
		public static void change_i(int i[]) 
		{
		      int j[] = {2};
		      i[0] = j[0];
		}
	}