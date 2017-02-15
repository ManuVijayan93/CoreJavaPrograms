package com.leapyear;

import java.util.Scanner;

public class LeapYear {
	int yr;
	
	public static void main(String args[])
	{  
		@SuppressWarnings("resource")
		
		Scanner scan=new Scanner(System.in);
		LeapYear l=new LeapYear();
	

		System.out.println("Enter The Year\n");
		l. yr=scan.nextInt();
		if(l.yr%100==0)
		{
			if(l.yr%400==0)
			System.out.println("The Year is Leap Year");
		else
			System.out.println("The Year is not Leap Year");
		}
		 if(l.yr%4==0)
			
			System.out.println("The Year is Leap Year");
		else
			System.out.println("The Year is not Leap Year");
			
		}
	}

