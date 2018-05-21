package com.java.listAndArrayTopics;

import java.util.ArrayList;
import java.util.List;

public class ListToArray implements Runnable {
@Override
		public void run(){
						
		// TODO Auto-generated method stub
		List<String> gadgetsList=new ArrayList<String>();
		gadgetsList.add("Iphone");
		gadgetsList.add("Ipad");
		gadgetsList.add("Tablet");
		System.out.println("Original List Contains"+gadgetsList);
		String[] sArray=new String[3];
		System.out.println("---------------------\nConverted to Array and values are");
		for(int i=0;i<3;i++)
		{
			sArray[i]=gadgetsList.get(i);
			
			System.out.println(sArray[i]);
		}
		List<String> gadgets=new ArrayList<String>();
		for(String str:sArray)
		{
			gadgets.add(str);
			
		}
		System.out.println("---------------------\nList Contains "+gadgets);
	}

					
}
