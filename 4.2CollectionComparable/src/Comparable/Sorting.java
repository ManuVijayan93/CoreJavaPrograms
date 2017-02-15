package Comparable;
import java.util.*;

public class Sorting 
{
	public static void main(String arg[])
	{
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(1001,"Sunil",34));
		list.add(new Student(1002,"Ketan",28));
		list.add(new Student(1003,"Wasim",15));
		
Collections.sort(list);
		
		for(Student st:list)
		{
			System.out.println(st.name+" "+st.age+" "+st.name);
		}
	}

}



