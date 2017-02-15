package com.superoverride;


class Customer extends BankDemo
{
	double interest;

	public Customer()
	{
	super(1767,"Raj");

	interest=0.04;
	}

	public void display()//override
	{
	System.out.println("Customer ID:"+custid);
	System.out.println("Customer Name:"+custname);
	System.out.println("Loan Interest Rate:"+interest);
	}

	public static void main(String arg[])
	{
	Customer b=new Customer();

	b.display();
	}
}
