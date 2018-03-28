package com.cg.fileio;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import org.apache.log4j.Logger;

public class ReadFromFile {

	public static int sendAck() {

		Logger logger = Logger.getLogger(ReadFromFile.class);
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fis = new FileInputStream("basic.log");
			fos = new FileOutputStream("basic.log");
			FileWriter fwriter = new FileWriter("basic.log",true);
			BufferedWriter out = new BufferedWriter(fwriter);

			out.write("Welcome");
			int count = fis.read();
			System.out.println(count);
		
			if(count==-1) {
				fos.write(53);
				
//				logger.info("\nWelcome");
				count++;
			}
			else {
				count = fis.read();
				if(count<52) {
					count++;
					fos.write(count);
					logger.info("Welcome to the Universe");
					
				}
				else {
					System.out.println("3 chances completed");
					System.exit(0);
				}	
			}
			
			System.out.println("Writing in the file");
				
		}catch(Exception ie) {
			ie.printStackTrace();
		}
		
		return 1;
	}
}