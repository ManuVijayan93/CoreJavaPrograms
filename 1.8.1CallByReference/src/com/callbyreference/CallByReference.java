package com.callbyreference;
import java.util.*;
class CallByReference
{
	int var1,var2;

	public CallByReference(int var1,int var2)
	{
	this.var1=var1;
	this.var2=var2;
	}

	public static void swap(CallByReference ob)
	{
		int temp;
		temp=ob.var1;
		ob.var1=ob.var2;
		ob.var2=temp;

		ob.display();
	}

	public void display()
	{
	System.out.println("Var1 :"+var1);
	System.out.println("Var2 :"+var2);
	}

	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		int a,b;
	
	System.out.println("Enter first num");
	a=scan.nextInt();
	System.out.println("Enter second  num");
	b=scan.nextInt();
	CallByReference obj=new CallByReference(a,b);

	CallByReference.swap(obj);

	obj.display();

	}

}