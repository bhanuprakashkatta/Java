package com.java.topicsCovered;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	final String bankName="XYZ";
	int accountNumber;
	String name;
	int balanceAmount;
	public Account(int accountNumber,String name,int balanceAmount) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balanceAmount=balanceAmount;
	}
	public void sysout()
	{
		System.out.println("Bank name --"+bankName+" Account Number --"+accountNumber+" Name -- "+name+" Amount --"+balanceAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account(101, " Bhanu ",1000);
		ac.sysout();
		ac= new Account(201, " prakash ", 2000);
		ac.sysout();

	}

}
