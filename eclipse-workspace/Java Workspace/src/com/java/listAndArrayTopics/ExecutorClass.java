package com.java.listAndArrayTopics;

public class ExecutorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new ListToArray());
		t1.start();
		
	}

}
