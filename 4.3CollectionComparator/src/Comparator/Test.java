package Comparator;
import java.util.*;
import java.io.*;
public class Test {
	public static void main(String args[])
	{
		ArrayList<ComparatorDemo>list=new ArrayList<ComparatorDemo>();
		ComparatorDemo obj=new ComparatorDemo(10,"rahul",25);
		ComparatorDemo obj1=new ComparatorDemo(10,"rahul",25);
		ComparatorDemo obj2=new ComparatorDemo(11,"Raj",21);
	
	list.add(obj);
	list.add(obj1);
	list.add(obj2);
	System.out.println("Before sorting");
	for(ComparatorDemo c:list)
	{
		System.out.println(c.toString());
	}
	Collections.sort(list,new Name());
	System.out.println("After sorting name wise");
	for(ComparatorDemo c:list)
	{
		System.out.println(c.toString());
		
	}
}
}