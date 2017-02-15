package com.enhancedforloop;

import java.util.ArrayList;

public class ListEnhancedForLoop {
	public static void main(String[] args) 
	{
		
		ArrayList  list=new ArrayList();
		
		
		list.add("Sunil");
		list.add("Harish");
		list.add("Vinod");

		list.add(10);
		list.add(20);
		
		System.out.println("Displaying Collection");
		
		for(Object o:list)
		{
			if(o instanceof String)
			{
				
				String str=(String)o;
				System.out.println(str);
			}
			if(o instanceof Integer)
			{
				Integer intr=(Integer)o;
				System.out.println(intr);
			}
			
		}
	}

}