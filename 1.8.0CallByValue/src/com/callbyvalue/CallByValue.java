package com.callbyvalue;
import java.util.*;
class CallByValue 
{
	//int c;
	public void swap(int a,int b)
	
	{int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping first num:" +a);
		System.out.println("After swapping second num:"+b);
		
	}
public static void main(String args[])
{   Scanner scan=new Scanner(System.in);
	int a,b;
	CallByValue s=new CallByValue();
	System.out.println("Enter first num");
	a=scan.nextInt();
	System.out.println("Enter second  num");
	b=scan.nextInt();
	s.swap(a,b);
	System.out.println("Now first num:" +a);
	System.out.println("Now second num:" +b);
}
}
