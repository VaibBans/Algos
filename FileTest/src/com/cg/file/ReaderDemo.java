package com.cg.file;

import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.StringReader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {

		int count = 0,val = 0;
		RandomAccessFile raf = new RandomAccessFile("demo.txt", "rws");
		FileWriter fw = new FileWriter("demo.txt",true);
		int c = raf.read();
		if(c==-1) {
			fw.write((char)49);
		}
		while(c!=-1&&c<52&&count<1) {
			int k=1;
			long j;
			for(j=0;k>0;) {
				j = raf.getFilePointer();
				k = raf.read();
			}
			raf.seek(j-1); 
			c = raf.read();
			val = c+1;
			if(val<=51) {
				fw.write((char)val);
			}
			else {
				val = 52;
				System.out.println("Exceeded the 3 limits.");
				break;
			}
			count++;
		}
		
		if(val>51) {
			FileWriter fwr = new FileWriter("demo.txt");
			System.out.println("Clearing the content of file");
			fw.write("");
			fwr.close();
		}
		System.out.println("Success");
		fw.close();
	}
}