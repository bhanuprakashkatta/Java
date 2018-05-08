package com.java.topicsCovered;

public class UserDetails {

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerWebsite sw=new SellerWebsite();
		Customer cs= null;
		cs=new Customer();
		cs=sw.loginDetails(10,"bhanu","frisco",false);
		
		String name=cs.getName();
		boolean status=cs.isStatus();
		if (status)
		System.out.println("Username "+name+" is in active");
		else
			System.out.println("Username "+name+" is not in active ");
		
		
		
				}

}
