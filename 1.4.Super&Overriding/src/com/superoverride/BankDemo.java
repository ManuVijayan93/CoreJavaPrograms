package com.superoverride;

public class BankDemo {
	
     	int custid;
		String custname;


		public BankDemo(int cid,String cname)
		{
	     custid=cid;
		custname=cname;
		}
		public void display()
		{
		System.out.println("Customer ID:"+custid);
		System.out.println("Customer Name:"+custname);
	}
	
	

}
