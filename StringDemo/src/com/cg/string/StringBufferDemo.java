package com.cg.string;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Hllo");
		System.out.println(s);
		s.insert(1, 'e');
		System.out.println(s);
		
		s.replace(2, 4, "LL");
//		s.delete(0, 1073741284);
		System.out.println(s);
		
		System.out.println("Initial Capacity "+s.capacity());
		s.ensureCapacity(s.capacity()+0);
		System.out.println("Final Capacity "+s.capacity());
	}
}