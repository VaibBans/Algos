package com.cg.arraylist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList {
	
	public static void main(String[] args) throws IOException {
		
		int i;
		ArrayList<Student> arr = new ArrayList<>();
		for(i=0;i<4;i++) {
			Student st = new Student(1,"A",100,7543);
			arr.add(st);
		}
		
		Iterator<Student> itr = arr.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ArrayList<Integer> iarr = new ArrayList<>();
		for(i=0;i<4;i++)
			iarr.add(1);
		
		Iterator<Integer> iitr = iarr.iterator();
		while(iitr.hasNext())
			System.out.println(iitr.next());
		
	}
	

}
