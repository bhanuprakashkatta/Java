package com.java.threading;

public class ExecutorClass {

	public ExecutorClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		ExecutorClass ec=new ExecutorClass();
		Thread t1=new Thread(new ExcelFile1Reading());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2=new Thread(new ExcelFile2Reading());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3=new Thread(new ExcelFile3Reading());
		t3.start();
		
	}

}
