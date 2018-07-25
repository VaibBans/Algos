package com.cg.userdefinedarray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudentTest {

	public static void main(String[] args) throws Exception{

		Student[] stuArr = new Student[1];
		int i=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Student s1;
		
		while(i<stuArr.length) {
			s1 = new Student();
			System.out.println("Enter Details");
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			s1.setName(st.nextToken());
			s1.setRollNo(Integer.parseInt(st.nextToken()));
			stuArr[i] = s1;
			i++;
		}
		
		for(Student s2 : stuArr)
			System.out.println(s2);
		
		System.out.println(stuArr.getClass());
		//		System.out.println(stuArr[2]); ArrayIndexOutOfBoundException
	}

}
