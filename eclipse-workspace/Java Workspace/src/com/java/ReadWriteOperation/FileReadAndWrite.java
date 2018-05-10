package com.java.ReadWriteOperation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public FileReadAndWrite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\bhanu\\Downloads\\Softwares\\Text.txt");
		char[] ch=null;
			try {
				FileReader fr=new FileReader(f);
				 ch= new char[((int)f.length())/2];
				fr.read(ch);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		File f1=new File("C:\\Users\\bhanu\\Downloads\\Softwares\\read.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f1);
			fw.write(ch);
			fw.close();
			System.out.println("File saved ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
