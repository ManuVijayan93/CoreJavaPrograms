package linkedlistadd;

import java.util.LinkedList;
import java.util.ListIterator;
public class ListDemo {
	public static void main(String arg[])
	{
		LinkedList list=new LinkedList();
		list.add("Ravi");
		list.add("Jacob");
		list.add("Thilak");
		list.add("Prabha");
		list.add("Surya");
		list.add(89);
		list.add(90);
		list.add(2,"MANU");
	//	list.add(new Customer("C300","Kiran"));
		
		ListIterator litr=list.listIterator();
		
		while(litr.hasNext())
		{
			
			
			Object o=litr.next();
			
			if(o instanceof String)
			{
				
				String str=(String)o;
				System.out.println(str);
				
				if(str.equals("Jacob"))
				{
					litr.remove();
				}
				
			}
			if(o instanceof Integer)
			{
				Integer intr=(Integer)o;
				System.out.println(intr);
			}
		
	}
	/*	System.out.println("traversing elements in backward direction...");  
		while(litr.hasPrevious()){  
		System.out.println(litr.previous());
		}*/
}
	
}
