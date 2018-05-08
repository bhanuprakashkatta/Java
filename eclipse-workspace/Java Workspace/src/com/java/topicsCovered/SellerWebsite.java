package com.java.topicsCovered;

public class SellerWebsite {

	public SellerWebsite() {
		// TODO Auto-generated constructor stub
		
	}
	public Customer loginDetails(int id,String name,String address,boolean status)
	{
		Customer c=null;
		if(status) {
			
		c=new Customer();
		c.setId(id);
		c.setName(name);
		c.setAddress(address);
		c.setStatus(status);
		}
		else
		{
			c=new Customer();
			c.setStatus(status);
			c.setName(name);
		}
		
		return c;
		
	}

}
